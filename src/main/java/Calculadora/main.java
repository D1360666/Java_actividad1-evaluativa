package Calculadora;

public class main {
    public static void main(String[] args) {
        Operacion resta = new Resta(200, 10);
        Operacion multiplicacion = new Multiplicacion(200, 10);
        Operacion suma = new Suma(200, 10);
        Operacion division = new Division(200, 10);
        Operacion mod = new Mod(200,100);

        resta.verresultado();
        multiplicacion.verresultado();
        suma.verresultado();
        division.verresultado();
        mod.verresultado();

    }
}
