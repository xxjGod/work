package com.xxjsmile.base.copy;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/8/1
 */
public class TestPerson {


    public static void main(String[] args) throws CloneNotSupportedException {
        testShallow();
    }

    private static void testShallow() throws CloneNotSupportedException {

        Person person = new Person();
        person.setAge(12);
        person.setName("xxj");
        Book book1 = new Book().setName("矮墙");
        person.setBook(book1);
        Person clone = (Person) person.clone();
        System.out.println(book1==clone.getBook());
    }
}
