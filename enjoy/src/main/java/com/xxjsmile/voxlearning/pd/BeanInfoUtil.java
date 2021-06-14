package com.xxjsmile.voxlearning.pd;

import com.xxjsmile.voxlearning.PersonPO;
import com.xxjsmile.voxlearning.PersonSimplePO;
import org.apache.commons.beanutils.BeanUtils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/14
 */
public class BeanInfoUtil {


    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {

        //正常bean
        //test(new PersonSimplePO());

        //testBeanUtil();
        //test(new PersonPO());


    }

    public static void testBeanUtil() throws InvocationTargetException, IllegalAccessException {
        PersonSimplePO personSimplePO = new PersonSimplePO();
        BeanUtils.setProperty(personSimplePO, "age", 12);
        System.out.println(personSimplePO.getAge());
    }

    public static void test(Object obj) throws IntrospectionException, InvocationTargetException, IllegalAccessException {

        //PersonSimplePO
        // 获取bean信息
        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        String pdName = "age";
        // 获取bean的所有属性列表
        PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
        // 遍历属性列表，查找指定的属性
        if (proDescrtptors != null && proDescrtptors.length > 0) {
            for (PropertyDescriptor propDesc : proDescrtptors) {
                // 找到则写入属性值
                if (propDesc.getName().equals(pdName)) {
                    try {
                        Method methodSetUserName = propDesc.getWriteMethod();
                        methodSetUserName.invoke(obj, 18);  // 写入属性值
                        break;
                    } catch (Exception e) {
                    }

                }
            }
        }
        System.out.println(obj instanceof PersonSimplePO ? ((PersonSimplePO) obj).getAge() : ((PersonPO) obj).getAge());
    }

    public static void getPropDesc(Object obj) throws IntrospectionException, InvocationTargetException, IllegalAccessException {


        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());

        // 获取bean的所有属性列表
        PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
        // 遍历属性列表，查找指定的属性
        if (proDescrtptors != null && proDescrtptors.length > 0) {
            for (PropertyDescriptor propDesc : proDescrtptors) {

                try {
                    System.out.println(propDesc.getName());
                } catch (Exception e) {
                }
            }
        }
    }

}
