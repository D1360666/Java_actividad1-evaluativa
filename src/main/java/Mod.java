public class Mod extends Operacion{

    double mod;

    public Mod(double n1, double n2){

        super(n1,n2,'%');
        this.mod = n1 % n2;
        this.resultado = this.mod;
    }
}