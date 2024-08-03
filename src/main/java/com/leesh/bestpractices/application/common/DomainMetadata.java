package com.leesh.bestpractices.application.common;

import com.leesh.bestpractices.application.workbook.domain.Creator;

import java.time.Instant;

public record DomainMetadata(Creator creator,
                             Modifier modifier,
                             Instant createTime,
                             Instant modifiedTime) {
}
