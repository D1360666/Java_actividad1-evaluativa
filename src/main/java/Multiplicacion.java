public class Multiplicacion extends Operacion{

    double multiplicacion;

    public Multiplicacion(double n1, double n2){

        super(n1,n2,'*');
        this.multiplicacion = n1 * n2;
        this.resultado = this.multiplicacion;

    }
}