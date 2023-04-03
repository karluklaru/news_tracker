package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.parser.answer.Answer;
import ru.tinkoff.edu.java.parser.answer.StackOverflowAnswer;

import java.net.URI;

public final class StackOverflowParser extends AbstractParser {

    public StackOverflowParser() {
        this.host = "stackoverflow.com";
    }

    @Override
    Answer parseURL(URI url) {
        if (url.getHost().equals(host)) {
            String[] split = url.getPath().split("/");
            if (split.length > 2) {
                return new StackOverflowAnswer(split[2]);
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
