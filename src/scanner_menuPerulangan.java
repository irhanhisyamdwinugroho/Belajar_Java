import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {System.out.print("Masukan Bilangan : ");
        int bilangan = input.nextInt();

        int hasil = bilangan*bilangan;
        System.out.println("Hasil perkalian bilangan tersebut adalah : " + hasil);
        System.out.println();

        System.out.print("Ingin memilih menu lain (y/t)? ");
        ulang = input.next().charAt(0);

        System.out.println();
    }
    while (ulang!= 't');
    System.out.println("Terimakasih...");

}
