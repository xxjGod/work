package com.xxjsmile.voxlearning.learning;


import org.apache.commons.beanutils.BeanUtils;

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
        //test2();
        test11();


    }

    /*private static void test3() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        PersonPO personPO = new PersonPO();
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName("18");
        PropertyUtils.setProperty(personPO, "name", "xxj");

        System.out.println("final:" + personPO.getName());
    }*/


    private static void test1() throws Exception    {
        //BeanInfo beanInfo = Introspector.getBeanInfo(icontext.getTargetClass());

//        PersonPO personPO = new PersonPO();
//        PersonDTO personDTO = new PersonDTO();
//        personDTO.setName("xxj");
//        BeanUtils.copyProperties(personPO, personDTO);
//
//        System.out.println("final:" + personPO.getName());
    }

     private static void test11() throws Exception{
        //BeanInfo beanInfo = Introspector.getBeanInfo(icontext.getTargetClass());

        PersonDTO dto = PersonDTO.builder().name("xxj").build();
        PersonPO po = PersonPO.builder().build();
        BeanUtils.copyProperties(po, dto);

        System.out.println("final:" + po.getName());

    }

    private static void test2() {

//        //this.beanInfo = new ExtendedBeanInfo(Introspector.getBeanInfo(beanClass));
//        PersonPO personPO = new PersonPO();
//        //PersonDTO personDTO = new PersonDTO();
//        personDTO.setName("xxj");
//        org.springframework.beans.BeanUtils.copyProperties(personDTO, personPO);
//
//        System.out.println("final:" + personPO.getName());
    }


}
