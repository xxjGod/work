package com.xxjsmile.voxlearning.learning.test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/30 16:10
 * All Rights Reserved
 */
public class ReflectCopy implements CopyStrategy {


    @Override
    public String getName() {
        return "ReflectCopy";
    }

    @Override
    public ToBean copy(FromBean fromBean) {
        ToBean toBean = new ToBean();
        Class<? extends FromBean> fromClass = fromBean.getClass();
        Class<? extends ToBean> toClass = toBean.getClass();
        Field[] fromFields = fromClass.getDeclaredFields();
        Field[] toFields = toClass.getDeclaredFields();
        Map<String, Field> toFieldMap = new HashMap<>();


        for (Field fromField : toFields) {
            toFieldMap.put(fromField.getName(), fromField);
        }


        for (Field fromField : fromFields) {
            String name = fromField.getName();
            if (toFieldMap.containsKey(name)) {
                //from  to
                try {
                    fromField.setAccessible(true);
                    Object value = fromField.get(fromBean);
                    Field toField = toFieldMap.get(name);
                    toField.setAccessible(true);
                    toField.set(toBean, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }


            }


        }

        return toBean;
    }
}
