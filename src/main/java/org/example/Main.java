package org.example;

import org.example.beans.HelloWord;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        HelloWord greeting = applicationContext.getBean("helloWord", HelloWord.class);

        System.out.println(greeting.getGreeting());

        applicationContext.close();
    }
}