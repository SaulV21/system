package com.studentinformation.system.service;

import com.studentinformation.system.model.Estudiante;
import com.studentinformation.system.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService{
    @Autowired
    private EstudianteRepository estudianteRepository;
    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findByStudentNumber(Long estudianteNumber) {
        return estudianteRepository.findByEstudianteNumber(estudianteNumber);
    }

    @Override
    public Estudiante findByEmail(String email) {
        return estudianteRepository.findByEmail(email);
    }

    @Override
    public List<Estudiante> findAllByOrderGpa() {
        return estudianteRepository.findAllByOrderByGpa();
    }

    @Override
    public void saveOrUpdateStudent(Estudiante estudiante) {
    estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteStuden(String id) {
        estudianteRepository.deleteById(id);
    }
}
