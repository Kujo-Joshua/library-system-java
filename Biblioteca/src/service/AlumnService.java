package src.service;

import java.util.List;

import src.model.Bibliotecario;
import src.model.Estudiante;

import java.util.ArrayList;
import java.util.HashMap;

public class UsersService {
    private List<Estudiante> alumnos=new ArrayList<>();
    private HashMap<Integer, Estudiante> alumnosPorId=new HashMap<>();
    //trie por implementar V 2.0?

    private List<Bibliotecario> bibliotecarios=new ArrayList<>();
    private HashMap<Integer, Bibliotecario> bibliotecariosPorId=new HashMap<>();
    //trie por implementar


    public void setAlumnos(List<Estudiante> alumnos) {
        this.alumnos = alumnos;
    }
    public List<Estudiante> getAlumnos() {
        return alumnos;
    }
    public void setAlumnosPorId(HashMap<Integer, Estudiante> alumnosPorId) {
        this.alumnosPorId = alumnosPorId;
    }
    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }
    public void setBibliotecariosPorId(HashMap<Integer, Bibliotecario> bibliotecariosPorId) {
        this.bibliotecariosPorId = bibliotecariosPorId;
    }
    public HashMap<Integer, Estudiante> getAlumnosPorId() {
        return alumnosPorId;
    }
    public List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }
    public HashMap<Integer, Bibliotecario> getBibliotecariosPorId() {
        return bibliotecariosPorId;
    }


    
}
