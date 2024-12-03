package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        private static ArrayList<Product> productos = new ArrayList<>();
        private static int lastProductId = 20;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        gestionarMenu();
    }

    private static void gestionarMenu() {
        int opcion;
        do {
            System.out.println("*********************************************************");
            System.out.println("* Bienvenido al Catálogo de Productos.                  *");
            System.out.println("* Selecciona una de las siguientes opciones:            *");
            System.out.println("* 1) Buscar Productos                                   *");
            System.out.println("* 2) Agregar Producto                                   *");
            System.out.println("* 3) Eliminar Producto                                  *");
            System.out.println("* 0) Salir                                              *");
            System.out.println("*********************************************************");
            System.out.print("Elige una opción: ");
            
            opcion = scan.nextInt();
            
    
            switch (opcion) {
                case 0 -> System.out.println("Saliendo de la aplicación...");
                case 1 -> BuscarProducto();
                case 2 -> AgregarProducto();
                case 3 -> BorrarProducto();
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0); 
    }

    private static void BuscarProducto(){
        System.out.println("1) Buscar productos por: ");
        System.out.println("a) ID");
        System.out.println("b) Categoria");
        System.out.println("c) Nombre");   
        System.out.println("d) Salir del buscador de productos");   
        System.out.println("*********************************************************");
        ElegirBuscador();
    }

    private static void AgregarProducto(){
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

    private static void BorrarProducto(){
        System.out.print("Ingresa el ID del producto a borrar: ");
        int id = scan.nextInt(); 
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
                    PDFYesOrNo(producto);

                } else {
                    System.out.println("No se encontró un producto con el ID proporcionado.");
                }
                break;
            case 'b':
                System.out.println("Has elegido buscar por categoria.");
                Categorias();
                break;
            case 'c':
                System.out.println("Has elegido buscar por nombre.");
                System.out.println("Ingresa su nombre: ");

                break;
            case 'd':
                System.out.println("Saliendo del buscador de productos.");
                gestionarMenu();
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                ElegirBuscador(); 
                break;
        }
    }
    private static void Categorias(){
        System.out.println("Escoge una categoria:");
        String categoriaElegida = ApiConnection.ImprimirCategorias(scan);
        System.out.println(categoriaElegida);
    }

    private static void PDFYesOrNo(Product producto){
        System.out.println("Quieres descargar el PDF de este articulo? (s/n)");
        String confirmacion = scan.nextLine();
            if (confirmacion.equalsIgnoreCase("s")) {
                ProductPDFCreator.guardaPDFDeProducto(producto);
                gestionarMenu();
            } else if(confirmacion.equalsIgnoreCase("n")){
                System.out.println("Volviendo al menu principal...");
                gestionarMenu();
            }else{
                System.out.println("Ingresa un valor correcto: (s/n)");
                PDFYesOrNo(producto);
            }
    }
}