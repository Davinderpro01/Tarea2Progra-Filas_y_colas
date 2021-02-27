import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Queue<String> listadoAviones = new LinkedList<>();
        String numeroAvion = null;

         while (true){
         menu();
         System.out.print("Elija la opción que desee = ");
         int op = ingreso.nextInt();


         if (op==1){
             ingresarAviones(listadoAviones);
             numeroAvion = listadoAviones.peek();
         }
         else{
             if (op==2){
                 System.out.println("Aviones esperando en el hangar");
                 listadoAviones.remove(listadoAviones.peek());
                 System.out.println(listadoAviones);
             }
             else{
                 if (op==3){
                     System.out.println("Aviones pendientes para despegar: ");
                     System.out.println(listadoAviones);
                 }
                 else{
                     if (op==4){
                         System.out.println("El próximo Avión a despegar es = " + numeroAvion);
                     }
                     else{
                         if (op==5){
                             System.out.println("Gracias por confiar en nuestro servicio");
                         }
                         else{
                             if (op>5){
                                 System.out.println("La opción no se encuentra en la lista");
                             }
                         }
                     }
                 }
             }
         }

         if (op == 5){
         break;
         }

         }

    }

    public static Queue ingresarAviones(Queue ListaAviones2){
        Scanner ingreso2 = new Scanner(System.in);

        while(true){
            System.out.println("Ingresa el nombre del avión, (puedes escribir 1 para salir) =  ");
            String opcion2 = ingreso2.next();

            if (opcion2.toLowerCase().equals("1")){
                break;
            }

            ListaAviones2.add(opcion2);
        }

        return ListaAviones2;
    }

    public static void menu(){
        System.out.println("======================= Menú =======================");
        System.out.println("1. Ingreso de aviones");
        System.out.println("2. Aviones disponibles en el Hangar");
        System.out.println("3. Aviones pendientes por despegar");
        System.out.println("4. Proximo Avión a despegar");
        System.out.println("5. Terminar programa");
        System.out.println("==================== Fin de Menú ===================");
    }

}