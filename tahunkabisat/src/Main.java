import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int tahun;

        System.out.println(" ## Program mengecek tahun kabisat ##");
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.print("Masukkan tahun: ");
        tahun = input.nextInt();

        if (tahun % 400 == 0){
            System.out.println(tahun + " adalah tahun kabisat!");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " Bukan tahun kabisat!");
        } else if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah tahun kabisat!");
        } else {
            System.out.println(tahun + " bukan tahun kabisat!");
        }
    }
}
