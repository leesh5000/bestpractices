package com.leesh.bestpractices.adapter.workbook.in;

import com.leesh.bestpractices.application.question.Question;

import java.util.List;

public record QuestionsMapper(List<Question> questions) {

        public QuestionsMapper {
            if (questions == null) {
                throw new IllegalArgumentException("Questions must not be null");
            }
        }

        public QuestionsMapper() {
            this(List.of());
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
