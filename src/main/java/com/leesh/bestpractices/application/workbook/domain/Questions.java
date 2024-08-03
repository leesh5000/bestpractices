package com.leesh.bestpractices.application.workbook.domain;

import com.leesh.bestpractices.application.question.Question;

import java.util.ArrayList;
import java.util.List;

record Questions(List<Question> questions) {

    public Questions {
        if (questions == null) {
            throw new IllegalArgumentException("Questions must not be null");
        }
    }

    public Questions() {
        this(new ArrayList<>());
    }

    public void add(Question question) {
        this.questions.add(question);
    }

    public void remove(Question question) {
        this.questions.remove(question);
    }

    public void clear() {
        this.questions.clear();
    }

    public int totalCount() {
        return this.questions.size();
    }
}
