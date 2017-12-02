import java.util.Scanner;
public class multiplicar {

    public void tablas(){
        Scanner i = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa un numero: ");
        numero = i.nextInt();
        Tabla(numero);

    }//fin main
    public static void Tabla(int numero){
        int i;
        for(i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",numero, i, (i * numero) );
        }


    }
}
