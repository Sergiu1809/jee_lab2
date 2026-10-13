import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String nume;
    private final String prenume;
    private final String grupa;
    private final List<Integer> note;

    public Student(String nume,String prenume, String grupa){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void adaugaNota(int nota){
        note.add(nota);
    }

    public boolean esteIntegralist() {
        for (int nota : note) {
            if (nota < 5) {
                return false;
            }
        }
        return true;
    }

    public int numarRestante() {
        int contor = 0;
        for (int nota : note) {
            if (nota < 5) {
                contor++;
            }
        }
        return contor;
    }


    public Double medie(){
        if (note.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return (double) suma / note.size();
    }
}
