import java.util.Scanner;

public class KonversiNilaiModif {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];
        int i = 0;

        while (i < 10) {
            System.out.print("Masukkan data ke-" + (i + 1) + ":");
            data[i] = scan.nextDouble();
            i++;
        }

        System.out.println("=====================");
        System.out.println("|   Hasil Konversi  |");
        System.out.println("=====================");
        keluar = konversiNilai(data);

        i = 0;
        while (i < 10) {
            System.out.println(data[i] + "  " + keluar[i]);
            i++;
        }
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;

        while (i < n) {
            switch ((int) Math.round(x[i])) {

                case 81: case 82: case 83: case 84: case 85: case 86: case 87:
                case 88: case 89: case 90: case 91: case 92: case 93: case 94:
                case 95: case 96: case 97: case 98: case 99: case 100:
                    hasil[i] = 'A';
                    break;
                case 61: case 62: case 63: case 64: case 65: case 66: case 67:
                case 68: case 69: case 70: case 71: case 72: case 73: case 74:
                case 75: case 76: case 77: case 78: case 79: case 80:
                    hasil[i] = 'B';
                    break;
                case 41: case 42: case 43: case 44: case 45: case 46: case 47:
			    case 48: case 49: case 50: case 51: case 52: case 53: case 54:
                case 55: case 56: case 57: case 58: case 59: case 60:
                    hasil[i] = 'C';
                    break;
                case 21: case 22: case 23: case 24: case 25: case 26: case 27:
			    case 28: case 29: case 30: case 31: case 32: case 33: case 34:
                case 35: case 36: case 37: case 38: case 39: case 40:
                    hasil[i] = 'D';
                    break;
                default:
                    hasil[i] = 'E';
                    break;
            }
            i++;
        }
        return hasil;
    }
}