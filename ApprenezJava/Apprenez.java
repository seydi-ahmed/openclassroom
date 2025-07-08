public class Apprenez {

    public static int addition (int a, int b) {
        return a + b;
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
        System.err.println("voici un nombre et un mot qui ne changeront pas dans notre programme: " + NUMEROFIXE + " et " + mot );


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
        double cc = (double)a / b;
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
        System.out.println(iphone.nom + " " + iphone.marque.nom + " " +  iphone.pixels);

    }

}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    public Telephone (int pixels, String nom, Marque marque) {
        this.marque = marque;
        this.nom = nom;
        this.pixels = pixels;
    }
}

class Marque {
    String nom;

    public Marque (String nom) {
        this.nom = nom;
    }
}