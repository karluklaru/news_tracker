package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.parser.answer.Answer;

import java.net.URI;

public abstract sealed class AbstractParser permits GitHubParser, StackOverflowParser {
    private AbstractParser next;
    protected String host;

    abstract Answer parseURL(URI url);

    public static AbstractParser createChain(AbstractParser... abstractParsers) {
        for (int i = 0; i < abstractParsers.length - 1; i++) {
            abstractParsers[i].setNext(abstractParsers[i + 1]);
        }
        return abstractParsers[0];
    }

    public void setNext(AbstractParser next) {
        this.next = next;
    }

    public AbstractParser getNext() {
        return next;
    }
}
