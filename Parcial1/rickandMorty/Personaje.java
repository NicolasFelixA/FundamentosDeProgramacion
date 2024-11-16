package rickandMorty;

import java.util.ArrayList;

public class Personaje {
    public int id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public Origin origin;
    public Location location;
    public String image;
    public ArrayList<String> episode;
    public ArrayList<String> personajes;
    public String url;
    public String created;

    // Clase anidada para Origin
    public static class Origin {
        public String name;
        public String url;
    }

    // Clase anidada para Location
    public static class Location {
        public String name;
        public String url;
    }

    public static char toLowerCase(char c) {
        // Verifica si el carácter está en mayúsculas
        if (c >= 'A' && c <= 'Z') {
            // Convierte a minúsculas al restar 32 (diferencia en ASCII)
            return (char) (c + 32);
        }
        // Si ya está en minúsculas o no es una letra, retorna el mismo carácter
        return c;
    }
    
}
