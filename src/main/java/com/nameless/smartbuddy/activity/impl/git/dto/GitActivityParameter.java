package com.nameless.smartbuddy.activity.impl.git.dto;

import com.nameless.smartbuddy.activity.dto.ActivityParameter;
import lombok.Data;

@Data
public class GitActivityParameter implements ActivityParameter {

    private String username;
    private String password;
    private String repository;
    private String branch;

}
