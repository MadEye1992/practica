import java.util.Scanner;
public class ParesImpares {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
    
    int numero, contadorpares = 0, contadorimpares = 0;
    
        System.out.println("Favor ingrese el numero");
        numero = entrada.nextInt();
        
        while(numero != 0){
             
             if(numero%2==0)
                contadorpares = contadorimpares + 1;
             else
                 contadorimpares = contadorpares +1;
             
            System.out.println("Por favor ingresar numero");
            numero = entrada.nextInt();
        }
        System.out.println("Cantidad de numeros pares: " + contadorpares +
                "Cantidad de numeros impares; " + contadorimpares);
   }
}
