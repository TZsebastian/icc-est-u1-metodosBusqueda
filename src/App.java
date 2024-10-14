import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        //int[] arreglo = {10,20,30,40,50,60,70,80,90,100};
        int[] arreglo = new int[100000];

        for(int i = 0; i < 100000; i++){
            arreglo[i] = i + 1;
        }
        System.out.println(arreglo);
        metodosBusqueda.printArreglo(arreglo);

        long startTimeSecuencial = System.nanoTime();

        int posicion = metodosBusqueda.busquedaSecuencial(arreglo,50418);

        long endTimeSecuencial = System.nanoTime();

        System.out.println("Tiempo de ejecución de la búsqueda Secuencial: " + 
                   (endTimeSecuencial - startTimeSecuencial) + " nanosegundos");

        if(posicion != -1){
        System.out.println("El valor se encuentra en la posición " + posicion);
    } else 
        System.out.println("Valor no encontrado 404");

        long startTimeBinaria = System.nanoTime(); // Iniciar el temporizador

        int posicion2 = metodosBusqueda.busquedaBinaria(arreglo, 50418); // Llamar a la búsqueda binaria

        long endTimeBinaria = System.nanoTime(); // Finalizar el temporizador

        System.out.println("Tiempo de ejecución de la búsqueda binaria: " + 
                   (endTimeBinaria - startTimeBinaria) + " nanosegundos");

        if(posicion != -1){
        System.out.println("El valor se encuentra en la posición " + posicion2);
    } else 
        System.out.println("Valor no encontrado 404");


        /*int[] arr = {10,20,30,40,50,60,70,80,90,100};
        metodosBusqueda.printArreglo2(arr);

        int posicion2 = metodosBusqueda.busquedaBinaria(arr,50);
        if(posicion2 != -1){
        System.out.println("El valor se encuentra en la posición " + posicion);
    } else 
        System.out.println("Valor no encontrado 404");
    }*/
    }
}

