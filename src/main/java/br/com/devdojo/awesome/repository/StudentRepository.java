package br.com.devdojo.awesome.repository;

import br.com.devdojo.awesome.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName(String name);
}
