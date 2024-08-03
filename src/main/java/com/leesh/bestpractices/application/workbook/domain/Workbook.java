package com.leesh.bestpractices.application.workbook.domain;

import java.util.Objects;
import java.util.Optional;

class Workbook {

    private final WorkbookId id;
    private final Questions questions;
    private final WorkbookInfo info;

    public Workbook(Questions questions, WorkbookInfo info, WorkbookId id) {
        this.questions = questions;
        this.info = info;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workbook workbook = (Workbook) o;
        return Objects.equals(id, workbook.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /* Business Logic */
    public Optional<WorkbookId> getId() {
        return Optional.ofNullable(this.id);
    }

}
