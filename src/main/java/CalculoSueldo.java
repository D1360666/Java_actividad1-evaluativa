import javax.swing.*;
import java.util.Scanner;

public class CalculoSueldo {
    public static void main(String[] args) {

        int sueldoBasico=0;
        String areaTrabajo;
        int nroHijos;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese sueldo básico:");
        sueldoBasico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo básico:"));

        //sueldoBasico = sc.nextInt();
        //System.out.println("Ingrese área de trabajo:");

        areaTrabajo =JOptionPane.showInputDialog("Ingrese área de trabajo:");

        //System.out.println("Cantidad de hijos a cargo:");
        //nroHijos = sc.nextInt();
        nroHijos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de hijos a cargo:"));



        int bonificacion=10;


        Double sueldoFinal=Double.valueOf(sueldoBasico);

        if(areaTrabajo.equals("Sistemas")){
            bonificacion=25;
        }else if(areaTrabajo.equals("Contabilidad")){
            bonificacion=200;
        }
        sueldoFinal = sueldoFinal + (Double.valueOf(sueldoBasico) * Double.valueOf(bonificacion)) / 100;

        if(nroHijos>1){
            for(int i=1;i<=nroHijos;i++){
                sueldoFinal =+ 500.0;
            }
        }
        JOptionPane.showMessageDialog(null,"El sueldo a pagar es: " + sueldoFinal);
        System.out.println("El sueldo a pagar es: " + sueldoFinal);

    }
}
