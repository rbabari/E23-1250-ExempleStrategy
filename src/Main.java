import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        // Avoir un robot (contexte)
        Robot r1 = new Robot("Robot Aspirateur");
        Robot r2 = new Robot("Robot Cop");
        Robot r3 = new Robot("Robot T1000");

        r1.setBehaviour(new AgressiveBehaviour());
        r2.setBehaviour(new DefensiveBehaviour());
        r3.setBehaviour(new NormalBehaviour());

        r1.move();
        r2.move();
        r3.move();
        System.out.println("------ Modification de strategies ------");
        r1.setBehaviour(new NormalBehaviour());
        r3.setBehaviour(new AgressiveBehaviour());

        r1.move();
        r2.move();
        r3.move();



        // Modifier son comportement ( strategy / algorithme ) au moment de l'execution...
        // Avoir des strategies interchangeables...


    }
}