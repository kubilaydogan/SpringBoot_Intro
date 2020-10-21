package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// this runner class should be on top level (one level up)
public class CybertekApp {
    public static void main(String[] args) {

//        Course course = new Java();  ==> Now, we are not using this way

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = (Course) container.getBean("java");
        Course course2 = container.getBean("java", Course.class);

        course.getTeachingHours();;


        //behind the scenes
        //OfficeHours officeHours = new OfficeHours();
        //Java java = new Java(officeHours);

        /*
            java class implements Course
            OfficeHours implements ExtraSessions
            Selenium implements Course
         */


    }
}
