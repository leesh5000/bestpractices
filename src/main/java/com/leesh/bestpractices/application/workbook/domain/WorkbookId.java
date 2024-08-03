package com.leesh.bestpractices.application.workbook.domain;

record WorkbookId(String value) {
    public WorkbookId {
        if (value == null) {
            throw new IllegalArgumentException("WorkbookId must not be null");
        }
    }
}
