package ru.tinkoff.edu.java.parser.answer;

public final class GitHubAnswer extends Answer {
    private final String userName;
    private final String repo;

    public GitHubAnswer(String userName, String repo) {
        this.userName = userName;
        this.repo = repo;
    }

    @Override
    public String toString() {
        return "GitHubAnswer{" +
                "userName='" + userName + '\'' +
                ", repo='" + repo + '\'' +
                '}';
    }
}
