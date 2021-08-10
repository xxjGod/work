package com.xxjsmile.voxlearning.work.yiqixuevip;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: ai book
 * @author: xiangjie.xiao
 * @create: 2021-08-02 10:41
 **/
@Data
public class AiBookMapper implements Serializable {

    private static final long serialVersionUID = 2905796293802150907L;


    private String resourceId;

    /**
     * pdf
     */
    private String pdfUrl;


    private String img;
    private String name;
    private String subName;
    /**
     * 类型
     * 同步版
     * <p>
     * 基础版
     * <p>
     * 拔高版
     */
    private String type;

    /**
     * 上册
     * 下册
     */
    private String volume;

    /**
     * 年级
     */
    private String grade;
}



