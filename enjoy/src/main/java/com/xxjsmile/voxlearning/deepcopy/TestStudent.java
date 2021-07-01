package com.xxjsmile.voxlearning.deepcopy;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/30 10:59
 * All Rights Reserved
 */
public class TestStudent {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName("xxj");
        BookPO bookDTO = new BookPO();
        bookDTO.setName("韭菜的自我修养");

        List<BookPO> bookPOS = new ArrayList<>();
        bookPOS.add(bookDTO);
        studentDTO.setBookPO(bookPOS);
        System.out.println("first:" + bookPOS);

        StudentPO studentPO = new StudentPO();

        BeanUtils.copyProperties(studentPO, studentDTO);

        //org.springframework.beans.BeanUtils.copyProperties(studentDTO, studentPO);

//        BeanCopier beanCopier = BeanCopier.create(studentDTO.getClass(),studentPO.getClass(),false);
//        beanCopier.copy(studentDTO,studentPO,null);
        //System.out.println("final:" + bookDTO);
        System.out.println("final:" + studentPO.getBookPO());


    }

}
