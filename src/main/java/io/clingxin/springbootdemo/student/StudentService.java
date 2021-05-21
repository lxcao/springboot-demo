/*
 * @Author: clingxin
 * @Date: 2021-05-20 19:57:42
 * @LastEditors: clingxin
 * @LastEditTime: 2021-05-21 09:30:31
 * @FilePath: /springboot-demo/src/main/java/io/clingxin/springbootdemo/student/StudentService.java
 */
package io.clingxin.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
		// return List.of(
		// 	new Student(1L, "Mariam", "mariam.jamal@gmail.com", LocalDate.now(), 21)
		// );
        return studentRepository.findAll();
	}
}
