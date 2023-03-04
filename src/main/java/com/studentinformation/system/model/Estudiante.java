package com.studentinformation.system.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@Document(collection="estudiantes")
@Data
public class Estudiante {
    @Id
    private String id;
    private String nombre;
    private Long estudianteNumber;
    private String email;
    private List<String> cursoLista;
    private float gpa;
}
