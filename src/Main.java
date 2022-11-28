import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jenis_kelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;

        // main Menu
        System.out.println("Program Java Menghitung Berat Badan Ideal ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Jenis Kelamin: ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("-------------------------------------------");

        // logic
        System.out.print("Masukan Jenis Kelamin: ");
        jenis_kelamin = input.nextInt();
        System.out.print("Masukan Berat Badan: ");
        berat = input.nextFloat();
        System.out.print("Masukan Tinggi Badan: ");
        tinggi = input.nextFloat();
        meter = tinggi / 100;

        // rumus BMI (Body Mass Index)

        bmi = (berat/(meter * meter));

        // cetak Berat Badan BMI
        System.out.print("BMI: " + bmi + " ");

        if (bmi < 18.5){
            System.out.println("Kurus");
        } else if (bmi <= 22.9){
            System.out.println("Normal");
        } else if (bmi < 24.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obesitas");
        }

        // perhitungan dengan rumus broca
        switch (jenis_kelamin)
        {
            case 1 : broca = ((tinggi-100)-(0.10 * (tinggi-100))); break;
            case 2 : broca = ((tinggi-100)-(0.15 * (tinggi-100))); break;
            default : broca = 0;
        }

        hasil = (int) broca;
        System.out.println("Berat Badan Ideal Anda Menurut Broca " + hasil + " Kg");
    }
}