package com.xxj.mydesign.simplefactory;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-02-22 17:44
 **/
public class TestShapeFactory {

    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShapeName("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShapeName("rectangle");
        rectangle.draw();


    }
}
