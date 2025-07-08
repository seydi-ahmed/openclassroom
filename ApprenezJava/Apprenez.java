import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apprenez {

    public static int addition(int a, int b) {
        return a + b;
    }

    static void printEntry(Map.Entry entry) {
        System.out.println(entry.getKey() + " --> " + entry.getValue());
    }

    public static void main(String[] args) {

        int incomes = 500;
        int saving = 1000;
        int x = incomes + saving;
        System.out.println(x);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        String prenomPersonne = "Mouhamed";
        String nomPersonne = "Diouf";
        System.out.println("mon nom est: " + nomPersonne + " et nom prénom est: " + prenomPersonne);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        final int NUMEROFIXE = 7;
        final String mot = "mot fixe";
        System.err.println(
                "voici un nombre et un mot qui ne changeront pas dans notre programme: " + NUMEROFIXE + " et " + mot);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        int count = 0;
        for (int i = 0; i < prenomPersonne.length(); i++) {
            count++;
        }
        System.out.println(count + " est le nombre de caractéres dans le nom");

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        double nombreDouble = 14567.1234567890987655678904567843;
        System.out.println(nombreDouble);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        int a = 5;
        int b = 2;
        int c = a / b;
        int d = a % b;
        double cc = (double) a / b;
        System.out.println(addition(a, b));
        System.out.println("c=" + c + "; cc=" + cc + "; d=" + d);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        boolean Deugeu;
        if (a > b) {
            Deugeu = true;
        } else {
            Deugeu = false;
        }
        System.out.println(Deugeu);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        String myCity = "Dakar City";
        String secondCity = "New York";
        String city = myCity + " " + secondCity;
        System.out.println(city);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        String exemple = "hello";
        System.out.println(exemple.toUpperCase());
        exemple = exemple.replace("hell", "Yeah");
        System.out.println(exemple);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        int comeBack = 2;
        final int comeToBack = comeBack;
        comeBack = 3;
        System.out.println(comeToBack);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        Marque apple = new Marque("apple");
        System.out.println(apple.nom);
        Telephone iphone = new Telephone(124, "samsung", apple);
        System.out.println(iphone.nom + " " + iphone.marque.nom + " " + iphone.pixels);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        Voiture voiture = new Voiture();
        Bateau bateau = new Bateau();

        voiture.start();
        bateau.start();

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        String[] prenoms = new String[10];
        for (int i = 0; i < prenoms.length; i++) {
            System.out.println(prenoms[i]);
        }

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        List<String> listesDeNoms = new ArrayList<String>();
        listesDeNoms.add("Mamadou");
        listesDeNoms.add("Mamadou");
        System.out.println(listesDeNoms);

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Jean", 34);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            printEntry(entry);
        }

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();

        try {
            FileReader fileReader = new FileReader("../roadmap.md");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }



}

class Vehicule {
    void start() {
        System.out.println("VROOOOM");
    }
}

class Voiture extends Vehicule {

    void start() {
        super.start();
        allumer();
    }

    void allumer() {
        System.out.println("Allumage des feux");
    }
}

class Bateau extends Vehicule {

}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    public Telephone(int pixels, String nom, Marque marque) {
        this.marque = marque;
        this.nom = nom;
        this.pixels = pixels;
    }
}

class Marque {
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}