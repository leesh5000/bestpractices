package com.leesh.bestpractices.application.workbook.domain;

import java.time.Instant;

public record WorkbookInfo(Creator creator,
                           Instant createTime,
                           Instant modifiedTime) {
}
