package voxlearning;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/10 18:27
 * All Rights Reserved
 */
public class TestMain {

    public static void main(String[] args) throws Exception{
        test1();
        //test2();
    }

    private static void test2() throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(SimplePerson.class);

        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : descriptors) {
            System.out.println(descriptor+""+descriptor.getWriteMethod());
        }

    }

    private static void test1() throws IntrospectionException {

        BeanInfo beanInfo = Introspector.getBeanInfo(PersonDTO.class);

        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : descriptors) {
            System.out.println(descriptor+""+descriptor.getWriteMethod());
        }

    }
}
