package com.xxjsmile.voxlearning.deepcopy;

import com.xxjsmile.voxlearning.learning.deepcopy.StudentDTO;
import com.xxjsmile.voxlearning.learning.deepcopy.StudentPO;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/30
 */
public class TestCopy {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Book book = new Book();
        book.setName("韭菜的自我修养");

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName("xxj");
        studentDTO.setBook(book);

        StudentPO studentPo = new StudentPO();
        BeanUtils.copyProperties(studentPo, studentDTO);

        System.out.println("dto book:"+studentDTO.getBook());
        System.out.println("po book:"+studentPo.getBook());
    }
}
