import java.util.Comparator;

public class ByRestanteComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.numarRestante(), s2.numarRestante());
    }
}
