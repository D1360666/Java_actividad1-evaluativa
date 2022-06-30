package Ej4;

public class Profesor {
    private String materia;

    public Profesor() {
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean habilitado(int faltas, int totalClases){
        int limite = (totalClases * 20)/100;
        if(faltas>limite){
            return false;
        }
        return true;
    }
}
