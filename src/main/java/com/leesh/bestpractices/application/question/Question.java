package com.leesh.bestpractices.application.question;

import java.util.Objects;
import java.util.Optional;

public class Question {

    private QuestionId id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /* Business Logic */
    public Optional<QuestionId> getId() {
        return Optional.ofNullable(this.id);
    }

    public void solve() {
        // Solve the question
    }

}
