package com.xxjsmile.vox;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/11
 */
@Getter
@Setter
@Accessors(chain = true)
public class PersonDTO {
    private String name;

    private Integer age;

    private List<String> likes;



}


