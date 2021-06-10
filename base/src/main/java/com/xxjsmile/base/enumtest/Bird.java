package com.xxjsmile.base.enumtest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/6
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bird implements Serializable {

    private String name;
    private String id;




}
