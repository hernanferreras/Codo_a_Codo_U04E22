
package u04e22;
import java.util.Scanner;
public class U04E22 {

    public static void main(String[] args) {
       int num1, x, z;
       Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas de la escalera: ");
        num1 = entrada.nextInt();
        x = 1;
        while (x<=num1){
            for (z=1; z<=x; z++){
            System.out.print("*");
            }
            System.out.print("\n");
            x++;
        }
    }
}