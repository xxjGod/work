package com.xxjsmile.voxlearning.deepcopy;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.lang.reflect.InvocationTargetException;

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
        BookDTO bookDTO = new BookDTO();
        bookDTO.setName("韭菜的自我修养");
        studentDTO.setBookDTO(bookDTO);
        System.out.println("first:" + studentDTO);

        StudentPO studentPO = new StudentPO();

        BeanUtils.copyProperties(studentPO, studentDTO);

        //org.springframework.beans.BeanUtils.copyProperties(studentDTO, studentPO);

//        BeanCopier beanCopier = BeanCopier.create(studentDTO.getClass(),studentPO.getClass(),false);
//        beanCopier.copy(studentDTO,studentPO,null);
        System.out.println("final:" + studentPO.getBookPO());


    }

}
