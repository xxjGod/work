package com.xxjsmile.voxlearning.work.yiqixuevip;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 返回给前端aibook数据
 * @author: xiangjie.xiao
 * @create: 2021-08-02 17:10
 **/
@Data
public class AiBookResponseMapper implements Serializable {
    private static final long serialVersionUID = -4943545500714740211L;

    private String grade;

    /**
     * 上册
     */
    private List<AiBookMapper> oneVolume;

    /**
     * 下册
     */
    private List<AiBookMapper> twoVolume;
}
