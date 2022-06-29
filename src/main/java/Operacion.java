

public class Operacion{

    double n1;
    double n2;
    double res;
    double resultado;

    public Operacion(double n1, double n2, double resultado){
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
    }

    public void verresultado(){
        System.out.println(this.n1+ " "+this.n2+" - Resultado: " +this.resultado+ " "+this.res);
    }
}




