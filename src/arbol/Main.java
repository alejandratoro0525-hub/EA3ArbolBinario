package arbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("/n---MENÚ ÁRBOL BINARIO ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a insertar: ");
                    int numeroInsertar = scanner.nextInt();
                    arbol.insertar(numeroInsertar);
                    System.out.println("Número insertado.");
                    break;
                case 2:
                    System.out.println("Recorrido inorden:");
                    arbol.inorden();
                    break;
                case 3:
                    System.out.print("Ingrese el número a buscar:");
                    int numeroBuscar = scanner.nextInt();
                    if (arbol.buscar(numeroBuscar)) {
                        System.out.println("Número encontrado.");
                    } else {
                        System.out.println("Número no existe.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
