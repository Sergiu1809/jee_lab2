import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Problema2 {
    public static void main(String[] args) {

        Random rand = new Random();

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        // a) note aleatorii in intervalul [4..10]
        for (Student s : studenti) {
            for (int i = 0; i < 5; i++) {
                s.adaugaNota(rand.nextInt(7) + 4);
            }
        }

        // b1) alfabetic, pe grupe
        System.out.println("b1) Ordonare dupa grupa, nume, prenume");
        List<Student> alfabetic = new ArrayList<>(studenti);
        Collections.sort(alfabetic, new ByGroupAndNameComparator());
        for (Student s : alfabetic) {
            System.out.println(s);
        }

        // b2) integralisti, descrescator dupa medie
        System.out.println("\nb2) Integralisti, descrescator dupa medie");
        List<Student> integralisti = new ArrayList<>();
        for (Student s : studenti) {
            if (s.esteIntegralist()) {
                integralisti.add(s);
            }
        }
        Collections.sort(integralisti, new ByGradesComparator());
        if (integralisti.isEmpty()) {
            System.out.println("Niciun integralist.");
        } else {
            for (Student s : integralisti) {
                System.out.println(s);
            }
        }

        // b3) restantieri, crescator dupa numarul de restante
        System.out.println("\nb3) Restantieri, crescator dupa nr. de restante");
        List<Student> restantieri = new ArrayList<>();
        for (Student s : studenti) {
            if (!s.esteIntegralist()) {
                restantieri.add(s);
            }
        }
        Collections.sort(restantieri, new ByRestanteComparator());
        if (restantieri.isEmpty()) {
            System.out.println("Niciun restantier.");
        } else {
            for (Student s : restantieri) {
                System.out.println(s);
            }
        }
    }
}
