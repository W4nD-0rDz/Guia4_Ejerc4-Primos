
package ejercicio4;

import java.util.Scanner;

/**
 * Pedir dos números por teclado
 * pasar a la función Primo
 * Crear una función lógica que analice si un número es primo o no
 * la variable de retorno debe ser lógica (true or false)
 * @author Wendy
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       boolean primo; 
       
       System.out.println("Ingrese un número");
       num1 = leer.nextInt();
       primo = Primo(num1);
       
       if (primo == true){
           System.out.println(num1 + " es primo.");
       } else {
           System.out.println(num1 + " no es primo.");
       } 
    }
    
    ///Función Primo
    public static boolean Primo(int num1){
        boolean primo = true;
                
        if (num1 == 0 || num1 == 1){
            primo = false;
        } else { 
                for (int i = 2; i < num1 ; i++){
                   if(num1 % i == 0){
                        primo = false;
                        break;  // para salir del loop.
                   } 
                }
                }
//        System.out.println("Retorno: " + primo);
        return primo;
    }
    
}
