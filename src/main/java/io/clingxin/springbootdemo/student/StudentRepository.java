/*
 * @Author: clingxin
 * @Date: 2021-05-21 09:24:21
 * @LastEditors: clingxin
 * @LastEditTime: 2021-05-21 09:25:48
 * @FilePath: /springboot-demo/src/main/java/io/clingxin/springbootdemo/student/StudentRepository.java
 */
package io.clingxin.springbootdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}

