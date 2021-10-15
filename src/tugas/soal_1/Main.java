package tugas.soal_1;

public class Main {
    public static void main(String[] args) {

        int a = 20, b = 20;

        Segitiga obj = new Segitiga();

        System.out.printf("Total sudut A adalah %d \n", obj.totalSudut(90));
        System.out.printf("Total sudut A dan B adalah %d \n", obj.totalSudut(90, 45));
        System.out.printf("Total keliling sisi A, B, dan C adalah %d \n",
                obj.keliling(a, b, (int) obj.pitagoras(a, b)));

        System.out.printf("Total keliling sisi A, dan B adalah %.2f \n", obj.keliling(a, b));
    }
}
