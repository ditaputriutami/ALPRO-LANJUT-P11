import java.util.Scanner;
public class Latihan2_11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double bil2 = input.nextDouble();

        System.out.print("Pilih operator (+, -, *, /, %):");
        char operator = input.next().charAt(0);

        double hasil;

        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                System.out.println("Jumlahnya adalah = " + hasil);
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.println("Selisihnya adalah = " + hasil);
                break;
            case '*':
                hasil = bil1 * bil2;
                System.out.println("Hasil perkaliannya adalah = " + hasil);
                break;
            case '/':
                hasil = bil1 / bil2;
                System.out.println("Hasil baginya adalah = " + hasil);
                break;
            case '%':
                hasil = bil1 % bil2;
                System.out.println("Sisa pembagiannya adalah = " + hasil);
                break;
            default:
                System.out.println("Kesalahan! Operator tidak dikenali");
                break;
		}
	}
}
