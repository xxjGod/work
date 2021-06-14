package com.xxjsmile.voxlearning;


import org.apache.commons.beanutils.BeanUtils;


import java.util.Arrays;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/10 16:47
 * All Rights Reserved
 */
public class TestBeanCopy {

    public static void main(String[] args) throws Exception {
        //Apache
        //test1();
        //spring
        test2();

    }


    private static void test1() throws Exception {
        //BeanInfo beanInfo = Introspector.getBeanInfo(icontext.getTargetClass());
        PersonPO personPO = new PersonPO();
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAge(12);
        personDTO.setName("xxj");
        personDTO.setLikes(Arrays.asList("xxj", "xxr", "xxn"));
        BeanUtils.copyProperties(personPO, personDTO);

        System.out.println("final:" + personPO.getName());
    }

    private static void test2() {

        //this.beanInfo = new ExtendedBeanInfo(Introspector.getBeanInfo(beanClass));
        PersonPO personPO = new PersonPO();
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAge(12);
        personDTO.setName("xxj");
        personDTO.setLikes(Arrays.asList("xxj", "xxr", "xxn"));
        org.springframework.beans.BeanUtils.copyProperties(personDTO, personPO);

        System.out.println("final:" + personPO.getName());
    }


}
