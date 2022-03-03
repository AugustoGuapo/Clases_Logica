package clase1_logica_computacional;
import java.util.Scanner;

public class Clase1_Logica_Computacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación y estructura de variables
        //Tipo de dato - Nombre de la variable - = - información a asignar - ;
        int variable = 1;

        //TIPOS DE DATOS
        //NUMÉRICOS
        byte tipo1 = 127;
        short tipo2 = 32767;
        int tipo3 = 2147483647;
        long tipo4 = (long) Math.pow(2, 63);
        float tipo5 = 2;
        double tipo6 = 4/3;
        System.out.println(tipo1);
        System.out.println(tipo2);
        System.out.println(tipo3);
        System.out.println(tipo4);
        System.out.println(tipo5);
        System.out.println(tipo6);
        
        //BOOLEANO
        boolean tipo7 = false;
        System.out.println(tipo7);
        
        //DE CARACTERES
        char tipo8 = 78;
        System.out.println(tipo8);
        
        //DE CADENAS
        String tipo9 = "ASD";
        System.out.println(tipo9);
        
        //+ para sumar - para restar *para multiplicar /dividir
        int suma = 4+6;
        int suma2 = suma/2;
        System.out.println(suma2);

        //Método de print
        System.out.println("Esto sirve para imprimir texto en pantalla");
        
        //Método de Scanner
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su dato");
        String dato = entrada.nextLine();
        System.out.println(dato);
        
        //Programa de suma
        System.out.println("Digite su primer dato");
        int dato1 = entrada.nextInt();
        System.out.println("Digite su segundo dato");
        int dato2 = entrada.nextInt();
        int dato3 = dato1+dato2;
        System.out.println("Este es el resultado de la suma = " + dato3);
    }
    
}
