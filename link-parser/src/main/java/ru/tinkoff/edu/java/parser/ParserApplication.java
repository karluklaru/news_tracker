package ru.tinkoff.edu.java.parser;

import java.net.URI;

public class ParserApplication {

    public static void main(String[] args) {
        AbstractParser abstractParser = AbstractParser.createChain(new GitHubParser(), new StackOverflowParser());

        System.out.println(abstractParser.parseURL(URI.create("https://github.com/sanyarnd/tinkoff-java-course-2022/")));
        System.out.println(abstractParser.parseURL(URI.create("https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c")));
        System.out.println(abstractParser.parseURL(URI.create("https://stackoverflow.com/search?q=unsupported%20link")));
    }
}
