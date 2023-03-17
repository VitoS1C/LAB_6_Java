package testthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import testthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
