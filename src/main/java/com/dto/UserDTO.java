package com.dto;

import lombok.Data;

/*
    @ 用户信息DTO
    @ id - 昵称 - icon
 */

@Data
public class UserDTO {
    private Long id;
    private String nickName;
    private String icon;
}
