import java.util.*;

public class Probleme {

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); //a
        int p = 4;

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("a) xPlusY = " + xPlusY);

        List<Integer> comune = new ArrayList<>(x);
        comune.retainAll(y);
        Set<Integer> zSet = new TreeSet<>(comune); //b
        System.out.println("b) zSet = " + zSet);

        List<Integer> xMinusY = new ArrayList<>(x); //c
        xMinusY.removeAll(y);
        Collections.sort(xMinusY);
        System.out.println("c) xMinusY = " + xMinusY);

        List<Integer> xPlusYLimitedByP = new ArrayList<>(xPlusY);
        Iterator<Integer> it = xPlusYLimitedByP.iterator();
        while (it.hasNext()) {
            Integer valoare = it.next();
            if (valoare > p) {
                it.remove();
            }
        }
        Collections.sort(xPlusYLimitedByP);
        System.out.println("d) xPlusYLimitedByP = " + xPlusYLimitedByP);



    }
}
