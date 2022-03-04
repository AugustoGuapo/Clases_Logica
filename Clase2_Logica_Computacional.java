package clase2_logica_computacional;
import java.util.Scanner;
public class Clase2_Logica_Computacional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* TAREA DE SEBASTIAN
        System.out.println("cuanto compro de carne");
        int dato1 = entrada.nextInt ();
        System.out.println("cuanto compro de arroz");
        int dato2 = entrada.nextInt ();
        System.out.println("cuanto compro de aceite");
        int dato3 = entrada.nextInt ();
        System.out.println("cuanto compro de verduras");
        int dato4 = entrada.nextInt();
        int dato5 = dato1+dato2+dato3+dato4;
        System.out.println("en total de la compra es"+dato5); 
        */
        
        //COMPARADORES < > <= >= ==
        //Estructuras if
        System.out.println("Digite su edad");
        int variable = entrada.nextInt();
        if (variable < 18) {
            System.out.println("Es menor de edad");
        }
        //Estructuras if-else
        System.out.println("Digite su edad");
        int variable2 = entrada.nextInt();
        if (variable2 < 18) 
            System.out.println("Es menor de edad");
        else
            System.out.println("Es mayor de edad");

        //Estructuras if anidadas
        System.out.println("Digite su edad");
        int variable3 = entrada.nextInt();
        if (variable3 >= 18) {
            if (variable > 18)
                System.out.println("Es mayor de edad");
            else
                System.out.println("Usted apenas es mayor de edad");
        }
        else
            System.out.println("Es menor de edad");
              
        //Estructuras if-else if - else
        int variable4 = entrada.nextInt();
        if (variable4 >= 18 && variable4 < 50)
            System.out.println("Está en edad militar");
        else if (variable4 >= 50 && variable4 < 70)
            System.out.println("Es mayor de edad pero no en edad militar");
        else if (variable4 >= 70)
            System.out.println("Uste es cule viejo");            
        else
            System.out.println("Es menor de edad");
        
    }
    
}
