package com.codecool;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterApplication {

    public static void main( String[] args ){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        ConverterController converterController = (ConverterController) ctx.getBean("converterController");
        converterController.handleArgs(args);
    }


}
