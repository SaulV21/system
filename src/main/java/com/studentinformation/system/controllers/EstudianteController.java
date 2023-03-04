package com.studentinformation.system.controllers;

import com.studentinformation.system.model.Estudiante;
import com.studentinformation.system.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    @GetMapping(value = "/")
    public List<Estudiante> getAllStudents(){
        return estudianteService.findAll();
    }
    @GetMapping(value = "{estudianteNumber}")
    public Estudiante getEstudiantebyStudentNumber(@PathVariable("estudianteNumber") Long estudianteNumber){
        return estudianteService.findByStudentNumber(estudianteNumber);
    }
    @GetMapping(value = "/{email}")
    public Estudiante getByEmail(@PathVariable("email") String email){
        return estudianteService.findByEmail(email);
    }
    @GetMapping(value = "/orderByGpa")
    public List<Estudiante> finAllbyOrderByGpa(){
        return estudianteService.findAllByOrderGpa();
    }

    @PostMapping(value = "/")
    public ResponseEntity<?>saveorUpdateEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.saveOrUpdateStudent(estudiante);
        return new ResponseEntity<>("Estudiante agregado con exito", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{estudianteNumber}")
    public void deleteEstudiante(@PathVariable Long estudianteNumber){
        estudianteService.deleteStuden(estudianteService.findByStudentNumber(estudianteNumber).getId());
    }
}
