package ru.tinkoff.edu.java.parser.answer;

public final class StackOverflowAnswer extends Answer {
    private final String questionId;

    public StackOverflowAnswer(String questionId) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "StackOverflowAnswer{" +
                "id='" + questionId + '\'' +
                '}';
    }
}
