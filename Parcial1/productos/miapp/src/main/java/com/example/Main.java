package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        private static ArrayList<Product> productos = new ArrayList<>();
        private static int lastProductId = 20;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        ElegirOpcion();
    }

    private static void mostrarMenu(){   
        System.out.println("*********************************************************");
        System.out.println("* Bienvenido al Catálogo de Productos.                 *");
        System.out.println("* Selecciona una de las siguientes opciones:           *");
        System.out.println("* 1) Buscar Productos                                  *");
        System.out.println("* 2) Agregar Producto                                  *");
        System.out.println("* 3) Eliminar Producto                                 *");
        System.out.println("* 0) Salir                                             *");
        System.out.println("*********************************************************");
    }

    private static void ElegirOpcion(){    
        System.out.print("Elige una opción: ");
        int opcionElegida = scan.nextInt();
        switch (opcionElegida) {
            case 0:
                System.out.println("Saliendo de la operacion.");
            break;
            case 1:
                BuscarProducto();
            break;
            case 2:
                AgregarProducto();
            break;
            case 3:
                BorrarProducto();
            break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                ElegirOpcion();
            break;
        }
    }

    private static void BuscarProducto(){
        BuscarMenu();
    }
        

    private static void AgregarProducto(){
        AgregarProductoMenu();
    }

    private static void BorrarProducto(){
        BorrarProductoMenu();
    }

    private static void BuscarMenu(){
        System.out.println("1) Buscar productos por: ");
        System.out.println("a) ID");
        System.out.println("b) Categoria");
        System.out.println("c) Nombre");   
        System.out.println("d) Salir del buscador de productos");   
        System.out.println("*********************************************************");
        ElegirBuscador();
    }

    private static void AgregarProductoMenu() {
        System.out.println("Completa los campos para agregar el producto:");
        System.out.println("Ingresa el nombre del producto: ");
        scan.nextLine();

        String nombre = scan.nextLine();
        
        System.out.println("Ingresa el precio del producto: ");
        double precio = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Ingresa la descripción del producto: ");
        String descripcion = scan.nextLine();
        
        System.out.println("Ingresa la categoría del producto: ");
        String categoria = scan.nextLine();
        
        System.out.println("Ingresa la URL de la imagen del producto: ");
        String imagen = scan.nextLine();
        
        System.out.println("Ingresa la calificación del producto (por ejemplo, 4.5): ");
        double calificacion = scan.nextDouble();
        scan.nextLine();

        System.out.print("Ingresa la cantidad de votos para el producto: ");
        int votos = scan.nextInt();
        scan.nextLine();
        
        lastProductId++;
        
        Rating rating = new Rating(calificacion, votos);
        
        Product producto = new Product(lastProductId, nombre, precio, descripcion, categoria, imagen, rating);
        
        productos.add(producto);
        
        System.out.println("Producto agregado con éxito.");
    }

    private static void BorrarProductoMenu(){
        System.out.print("Ingresa el ID del producto a borrar: ");
        int id = scan.nextInt();
        scan.nextLine(); 
        
        Product producto = productos.stream()
                                      .filter(p -> p.getId() == id)
                                      .findFirst()
                                      .orElse(null);
        
        if (producto != null) {
            System.out.print("¿Estás seguro de que quieres borrar el producto? (s/n): ");
            String confirmacion = scan.nextLine();
            if (confirmacion.equalsIgnoreCase("s")) {
                productos.remove(producto);
                System.out.println("Producto borrado con éxito.");
            } else {
                System.out.println("Operación cancelada.");
            }
        } else {
            System.out.println("No se encontró un producto con ese ID.");
        }
    }
    
    
    private static void ElegirBuscador() {
        System.out.print("Elige una opción (a, b, c, d): ");
        char c = scan.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println("Has elegido buscar por ID.");
                System.out.print("Ingresa su Id: ");
                int id = scan.nextInt();
                scan.nextLine(); 
                System.out.println("*********************************************************");
                Product producto = ApiConnection.ImprimirPorID(id);
                if (producto != null) {
                    System.out.println("Producto encontrado:");
                    System.out.println("Nombre: " + producto.getTitle());
                    System.out.println("Precio: " + producto.getPrice() + "$");
                } else {
                    System.out.println("No se encontró un producto con el ID proporcionado.");
                }
                break;
            case 'b':
                System.out.println("Has elegido buscar por categoria.");
                System.out.println("Escoge una categoria:");
                break;
            case 'c':
                System.out.println("Has elegido buscar por nombre.");
                System.out.println("Ingresa su nombre: ");

                break;
            case 'd':
                System.out.println("Saliendo del buscador de productos.");
                ElegirOpcion();
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                ElegirBuscador(); 
                break;
        }
    }
}