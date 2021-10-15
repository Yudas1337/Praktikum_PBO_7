package tugas.soal_2;

public class Main {

    public static void main(String[] args) {
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa m1 = new Mahasiswa();

        m.bernafas();
        m.makan();

        d.makan();
        d.lembur();

        m1.makan();
        m1.tidur();
    }
}
