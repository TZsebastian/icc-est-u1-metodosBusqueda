public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        int interacciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            interacciones++;
            if (arreglo[i] == valorBuscado) {
                System.out.println(); 
                System.out.println("Numero de interacciones en búsqueda secuencial: " + interacciones);
                return i;
            }
        }
        System.out.println();
        System.out.println("Numero de interacciones en búsqueda secuencial: " + interacciones);
        return -1;
    }

    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println(); 
    }

    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        int interacciones = 0;

        while (inicio <= fin) {
            interacciones++;
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                System.out.println(); 
                System.out.println("Numero de interacciones en búsqueda binaria: " + interacciones);
                return medio;
            }

            if (arr[medio] < value) {
                inicio = medio + 1; // Buscar en la mitad de la derecha
            } else {
                fin = medio - 1; // Buscar en la mitad de la izquierda
            }
        }
        System.out.println(); 
        System.out.println("Numero de interacciones en búsqueda binaria: " + interacciones);
        return -1;
    }

    public void printArreglo2(int[] arr) {
        for (int elemento : arr) {
            System.out.print(elemento + " ");
        }
        System.out.println(); 
    }
}

