package com.udemy.springboot.learn_spring_boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "spring boot", "in@8min"),
                new Course(2,"m o", "udemy"),
                new Course(3, "oooooo", "udemu")
        );
    }
}
