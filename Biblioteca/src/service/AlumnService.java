package src.service;

import java.util.List;

import src.model.Bibliotecario;
import src.model.Alumn;

import java.util.ArrayList;
import java.util.HashMap;

public class AlumnService {
    private List<Alumn> alumnos=new ArrayList<>();
    private HashMap<Integer, Alumn> alumnosPorId=new HashMap<>();
    //trie por implementar V 2.0?

    private List<Bibliotecario> bibliotecarios=new ArrayList<>();
    private HashMap<Integer, Bibliotecario> bibliotecariosPorId=new HashMap<>();
    //trie por implementar


    public void setAlumnos(List<Alumn> alumnos) {
        this.alumnos = alumnos;
    }
    public List<Alumn> getAlumnos() {
        return alumnos;
    }
    public void setAlumnosPorId(HashMap<Integer, Alumn> alumnosPorId) {
        this.alumnosPorId = alumnosPorId;
    }
    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }
    public void setBibliotecariosPorId(HashMap<Integer, Bibliotecario> bibliotecariosPorId) {
        this.bibliotecariosPorId = bibliotecariosPorId;
    }
    public HashMap<Integer, Alumn> getAlumnosPorId() {
        return alumnosPorId;
    }
    public List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }
    public HashMap<Integer, Bibliotecario> getBibliotecariosPorId() {
        return bibliotecariosPorId;
    }


    
}
