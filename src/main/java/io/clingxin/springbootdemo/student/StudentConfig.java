/*
 * @Author: clingxin
 * @Date: 2021-05-21 09:36:15
 * @LastEditors: clingxin
 * @LastEditTime: 2021-05-21 10:12:47
 * @FilePath: /springboot-demo/src/main/java/io/clingxin/springbootdemo/student/StudentConfig.java
 */
package io.clingxin.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", "mariam.jamal@gmail.com", LocalDate.now().minusYears(18));
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.now().minusYears(19));
            repository.saveAll(List.of(mariam, alex));
        };
    }
}
