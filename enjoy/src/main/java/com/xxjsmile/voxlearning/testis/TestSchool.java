package com.xxjsmile.voxlearning.testis;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/30 18:31
 * All Rights Reserved
 */
public class TestSchool {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setAge(true);

        SchoolPO schoolPO = new SchoolPO();
        BeanUtils.copyProperties(schoolPO, schoolDTO);

        System.out.println("final:" + schoolPO.isAge());
    }
}
