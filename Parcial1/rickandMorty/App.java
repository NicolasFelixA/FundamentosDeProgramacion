package rickandMorty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        try {
            Character p1 = new Character();
            p1.name = "Michelle gamez";
            Character p2 = new Character();
            p2.name = "Nicolas Felix";
            Character p3 = new Character();
            p3.name = "Alejandro Escobar";
            Character p4 = new Character();
            p4.name = "Helena Gaxiola";
            Character p5 = new Character();
            p5.name = "Manuel Ruiz";
            Character personajes[] = {p1,p2,p3,p4,p5};
            String vocales = "aeiou"; // Solo vocales sin acento
        int contador = 0;

        // Contar vocales sin acento
        for (Character personaje : personajes) {
            for (char c : personaje.name.toLowerCase().toCharArray()) { // Convertir a minúsculas
                if (vocales.indexOf(c) != -1) { // Comprobar si es una vocal
                    contador++;
                }
            }
        }
            System.out.println("Hay "+contador+ " acentos en los nombres");
            Scanner scan = new Scanner(System.in);
            int personajeId = scan.nextInt();
            Character character = ApiUtil.getCharacterById(personajeId);
            System.out.println("Nombre: " + character.name);
            System.out.println("Estado: " + character.status);
            // Imprimir más datos según sea necesario
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
