package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.parser.answer.Answer;
import ru.tinkoff.edu.java.parser.answer.GitHubAnswer;

import java.net.URI;

public final class GitHubParser extends AbstractParser {
    public GitHubParser() {
        this.host = "github.com";
    }

    @Override
    public Answer parseURL(URI url) {
        if (url.getHost().equals(host)) {
            String[] split = url.getPath().split("/");
            if (!split[1].isBlank() && !split[2].isBlank()) {
                return new GitHubAnswer(split[1], split[2]);
            }
        }
        else {
            if (this.getNext() != null) {
                return this.getNext().parseURL(url);
            }
        }
        return null;
    }
}
