//package com.xxjsmile.voxlearning.learning.deepcopy;
//
//import org.apache.commons.beanutils.BeanUtils;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Description:
// * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
// * @Date 2021/6/30 10:59
// * All Rights Reserved
// */
//public class TestStudent {
//
//    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
//        StudentDTO studentDTO = new StudentDTO();
//        studentDTO.setName("xxj");
//        BookDTO bookDTO = new BookDTO();
//        bookDTO.setName("韭菜的自我修养");
//
//        List<BookDTO> bookDTOS = new ArrayList<>();
//        bookDTOS.add(bookDTO);
//        studentDTO.setBookPO(bookDTOS);
//        System.out.println("first:" + bookDTOS);
//
//        StudentPO studentPO = new StudentPO();
//
//        BeanUtils.copyProperties(studentPO, studentDTO);
//
//        //org.springframework.beans.BeanUtils.copyProperties(studentDTO, studentPO);
//
////        BeanCopier beanCopier = BeanCopier.create(studentDTO.getClass(),studentPO.getClass(),false);
////        beanCopier.copy(studentDTO,studentPO,null);
//        //System.out.println("final:" + bookDTO);
//        System.out.println("final:" + studentPO.getBookPO());
//
//
//    }
//
//}
