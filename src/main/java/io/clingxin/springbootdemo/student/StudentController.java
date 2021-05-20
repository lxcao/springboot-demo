/*
 * @Author: clingxin
 * @Date: 2021-05-20 19:23:31
 * @LastEditors: clingxin
 * @LastEditTime: 2021-05-20 20:11:05
 * @FilePath: /springboot-demo/src/main/java/io/clingxin/springbootdemo/student/StudentController.java
 */
package io.clingxin.springbootdemo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
