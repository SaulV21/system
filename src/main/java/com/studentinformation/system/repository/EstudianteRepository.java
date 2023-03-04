package com.studentinformation.system.repository;

import com.studentinformation.system.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
    Estudiante findByEstudianteNumber(Long estudianteNumber);
    Estudiante findByEmail (String email);
    List<Estudiante> findAllByOrderByGpa();
}
