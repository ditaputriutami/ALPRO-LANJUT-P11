import java.util.Scanner;
public class ProyekHitungJumlahModif {

    public static int hitungJumlah(int[] x){
        int jum=0;
        for (int i=0;i<x.length;i++){
            jum += x[i];
        }
        return jum;
    }

    public static double hitungRataRata(int[]x){
    int jumlah = hitungJumlah(x);
    return (double) jumlah / x.length;
    }

    public static void main(String[] args) {
        int data[] = new int[10];
        int jumlah;
        double RataRata;
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<10;i++){
            System.out.print("Masukkan data ke-"+(i+1)+":");
            data[i] = scan.nextInt();
        }
        jumlah = hitungJumlah(data);
        RataRata = hitungRataRata(data);

        System.out.println("Jumlah data = "+jumlah);
        System.out.println("Rata-Rata Data = " +RataRata);
    }
}
