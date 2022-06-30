package Ej4;

public class Aula {
    private int id;
    private int capacidad;
    private String materia;

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
}
