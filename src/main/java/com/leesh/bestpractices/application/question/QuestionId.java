package com.leesh.bestpractices.application.question;

public record QuestionId(String value) {

    public QuestionId {
        if (value == null) {
            throw new IllegalArgumentException("QuestionId must not be null");
        }
    }
}
