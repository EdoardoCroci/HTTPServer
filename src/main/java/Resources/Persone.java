package Resources;

import java.util.ArrayList;

public class Persone {
    private static ArrayList<Persona> arrayPersone = new ArrayList<>();

    public static void addPersona(Persona p) {
        arrayPersone.add(p);
    }
    
    public static ArrayList<Persona> getArrayPersone() {
        return arrayPersone;
    }

    public void setArrayPersone(ArrayList<Persona> arrayPersone) {
        this.arrayPersone = arrayPersone;
    }
}
