package com.leesh.bestpractices.application.discussion;

public record DiscussionId(String value) {
    public DiscussionId {
        if (value == null) {
            throw new IllegalArgumentException("DiscussionId must not be null");
        }
    }
}
