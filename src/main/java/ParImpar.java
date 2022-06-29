import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        int valor = sc.nextInt();
        if((valor%2)==0){
            System.out.println("Es Par");
        }else{
            System.out.println("Es Impar");
        }

    }
}
