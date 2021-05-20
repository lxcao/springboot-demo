/*
 * @Author: clingxin
 * @Date: 2021-05-20 19:57:42
 * @LastEditors: clingxin
 * @LastEditTime: 2021-05-20 20:05:23
 * @FilePath: /springboot-demo/src/main/java/io/clingxin/springbootdemo/student/StudentService.java
 */
package io.clingxin.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Mariam", "mariam.jamal@gmail.com", LocalDate.now(), 21)
		);
	}
}
