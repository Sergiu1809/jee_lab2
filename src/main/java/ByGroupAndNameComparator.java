import java.util.Comparator;

public class ByGroupAndNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int rezultat = s1.getGrupa().compareTo(s2.getGrupa());
        if (rezultat != 0) {
            return rezultat;
        }

        rezultat = s1.getNume().compareTo(s2.getNume());
        if (rezultat != 0) {
            return rezultat;
        }

        return s1.getPrenume().compareTo(s2.getPrenume());
    }
}
