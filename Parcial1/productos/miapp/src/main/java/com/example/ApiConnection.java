package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

public class ApiConnection {
    private static final String API_URL = "https://fakestoreapi.com/products/";
    private static HttpClient client = HttpClient.newHttpClient();
    private static Gson gson = new Gson();

    public static Product ImprimirPorID(int id) {
        try {
            // Construir la URL con el ID del producto
            String urlConId = API_URL + id;
    
            // Crear la solicitud HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlConId))
                    .GET()
                    .build();
    
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    
            // Validar el código de estado HTTP
            if (response.statusCode() == 200) {
                // Convertir la respuesta JSON a un objeto Product
                return gson.fromJson(response.body(), Product.class);
            } else {
                System.out.println("Error al obtener el producto. Código de estado: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Devolver null si ocurre un error o no se encuentra el producto
        return null;
    }

    public static void AgregarProducto(Product product) {
        try {
            String json = gson.toJson(product);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean EliminarProducto(int id) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + id))
                    .DELETE()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.statusCode() == 200;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
