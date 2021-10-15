package tugas.soal_1;

public class Segitiga {

    public int sudut;

    public int totalSudut(int sudutA) {
        return this.sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return this.sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(double sisiA, double sisiB) {
        return sisiA + sisiB;
    }

    // define pythagoras formula
    public double pitagoras(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

}
