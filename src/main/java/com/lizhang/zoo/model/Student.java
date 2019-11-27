package com.lizhang.zoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private String parentName;
    private String contact;
    private Integer chineseScore;
    private Integer englishScore;
    private Integer mathScore;
}
