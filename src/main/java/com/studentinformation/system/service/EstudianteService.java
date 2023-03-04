package com.studentinformation.system.service;

import com.studentinformation.system.model.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> findAll();
    Estudiante findByStudentNumber(Long estudianteNumber);
    Estudiante findByEmail(String email);
    List<Estudiante> findAllByOrderGpa();
    void saveOrUpdateStudent (Estudiante estudiante);
    void deleteStuden (String id);
}
