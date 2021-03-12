
package error.absoluto;
import java.util.Scanner;
public class ErrorAbsoluto {

    public static void main(String[] args) {
        double valorR, valorA;
        
       Scanner valor = new Scanner(System.in);
        System.out.print("inserte el valor real: ");
        valorR = valor.nextDouble();
        System.out.print("inserte el valor real: ");
        valorA = valor.nextDouble();
        
        errores errores = new errores(valorR, valorA);
        
        System.out.print(" el error absoluto es: " + errores.ErrorAbsoluto());
        System.out.print(" el error absoluto es: " + errores.ErrorRelativo());
        System.out.print(" el error absoluto es: " + errores.ErrorRelativoPorcentual() + "%");
            
    }
    
}
