package com.xxjsmile.vox;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/11
 */
public class TestApacheBeanCopy {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        PersonPO personPO = new PersonPO();
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAge(12).setName("xxj").setLikes(Arrays.asList("a","b","c"));


        BeanUtils.copyProperties(personPO,personDTO);

        System.out.println(personPO.getAge());
    }


}
