package com.dto;

import lombok.Data;

import java.util.List;

/*
    @ 分页信息
 */

@Data
public class ScrollResult {
    private List<?> list;
    private Long minTime;
    private Integer offset;
}
