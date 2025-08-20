
/**
 * Haz un programa que muestre un menú con varias opciones y que el usuario elija qué desea hacer.
 * Bienvenido al Sistema de Utilidades
Seleccione una opción:
1. Calculadora básica (suma, resta, multiplicación, división)
2. Verificar si un número es par o impar
3. Determinar el mayor, menor o igualdad entre dos números
4. Calcular edad (mayor o menor de edad)
5. Salir
 **/
package project.system.utility;
import java.util.Scanner;
/**
 *
 * @author patito321
 */
public class ProjectSystemUtility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int option1;
        System.out.println("Bienvenido al Systema de Utilidades\n Seleccione la opcion con la que desee Trabajar:\n"
                + "1.Calculadora Basica\n2.Verificar si un numero es par o impar\n3.Determinar el mayor, menor, o igualdad entre dos numeros\n"
                + "4.Calcular la edad para acceder\n5.Salir: \n");
        option1 = Leer.nextInt();
        switch(option1){
            case 1:{
                int option2;
                System.out.println("Bievenido, que problema matematico desea resolver:\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division: ");
                option2 = Leer.nextInt();
                switch(option2){
                    case 1:{
                        //Variable para digitar num y realizar la suma
                        int num1,num2,sum;
                        System.out.println("Digite un numero: ");
                        num1=Leer.nextInt();
                        System.out.println("Digite un numero: ");
                        num2=Leer.nextInt();
                        //Se procede a realizar la suma entre los datos solicitados;
                        sum = num1 + num2;
                        
                        System.out.println("La respuesta de la suma es: "+sum);
                        break;
                    }
                    case 2:{
                        //Variable para digitar los datos y realizar la resta
                        int num1,num2,resta;
                        System.out.println("Digte un numero: ");
                        num1 = Leer.nextInt();
                        System.out.println("Digite un numero: ");
                        num2 = Leer.nextInt();
                        //se procede a realizar la resta entre los datos
                        resta=num1-num2;
                        System.out.println("El resultado de la resta es: "+resta);
                        break;
                    }
                    case 3:{
                        //Variables para digitar los datos y realizar multiplicaciones
                        int num1, num2, mul;
                        System.out.println("Digite un numero: ");
                        num1=Leer.nextInt();
                        System.out.println("Digite un numero: ");
                        num2=Leer.nextInt();
                        //Procede a realizar la multiplicacion
                        mul=num1*num2;
                        System.out.println("EL resultado de la multiplicacion es: "+mul);
                        break;
                    }
                    case 4:{
                        //Variables para digitar los datos y realizar divisiones
                        int num1, num2, div;
                        System.out.println("Digite un numero: ");
                        num1=Leer.nextInt();
                        System.out.println("Digite un numero: ");
                        num2=Leer.nextInt();
                        //Procede a realizar la division
                        div=num1/num2;
                        System.out.println("El resultado de la division es: "+div);
                        break;
                    }
                }
                break;
            }
            case 2:{
                int num1;
                System.out.println("Digite un numero para calcular si es par o impar: ");
                num1=Leer.nextInt();
                if(num1%2==0){
                    System.out.println("Es Par");
                }else{
                    System.out.println("Es Impar");
                }               
                break;
            }
            
        }
        
        
        
        
    }
    
}
