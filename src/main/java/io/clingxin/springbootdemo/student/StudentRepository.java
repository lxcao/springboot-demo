/*
 * @Author: clingxin
 * @Date: 2021-05-21 09:24:21
 * @LastEditors: clingxin
 * @LastEditTime: 2021-05-21 16:37:51
 * @FilePath: /springboot-demo/src/main/java/io/clingxin/springbootdemo/student/StudentRepository.java
 */
package io.clingxin.springbootdemo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //@Query("SELECT s From Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}

