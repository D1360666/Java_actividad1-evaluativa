package Ej4;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int id;
    private int capacidad;
    private String materia;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private Profesor profesor;

    //Funciones--------------------------------
    public void addEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }


    //Constructores
    public Aula() {

    }

    public Aula(int id, int capacidad, String materia) {
        this.id = id;
        this.capacidad = capacidad;
        this.materia = materia;
    }

    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if(profesor.getMateria().equals(this.materia)){
            this.profesor = profesor;
        }
        
    }

    public boolean habilitado(int faltas, int totalClases){
        int limite = (totalClases * 50)/100;
        if(faltas>limite){
            return false;
        }
        return true;
    }
}
