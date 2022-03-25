import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String exit_prog;
        //        Input user data
//        Pesanan dan nama
        System.out.print("\nMasukkan Nama Anda [1..25] : ");
        String nama_mhs = scan.nextLine();

        System.out.print("Masukkan NIM Anda [harus 10 karakter]: ");
        int nim_mhs = Integer.parseInt(scan.nextLine());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        Nama menu
        System.out.println("Registrasi Sukses.....");
        System.out.println("Selamat datang " + nama_mhs + " [NIM :" + nim_mhs + "].. ^^__^^");
        System.out.println("Mari belajar macam-macam deret bilangan");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        var num for store variable input

        do {
            int num;
            System.out.print("\n Masukkan Sembarang Angka [5..20] : ");
            num = Integer.parseInt(scan.nextLine());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("\nDeret Bilangan" + "\n##############");
            System.out.print("\n " + num + " Bilangan Genap : \n");
            //Genap
            int sumGenap = 0;
            for (int i = 1; i <= num * 2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    sumGenap += i;
                }
            }
            System.out.println(" \nHasil Bilangan Genap = " + sumGenap);
            //Ganjil
            System.out.print("\n " + num + " Bilangan Ganjil : \n");
            int sumGanjil = 0;
            for (int i = 1; i <= num * 2; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                    sumGanjil += i;
                }
            }
            System.out.println(" \nHasil Bilangan Ganjil = " + sumGanjil);
            //Fibanocci
            System.out.print("\n " + num + " Bilangan Fibonacci : \n");
            int sum = 0;
            int n1 = 1;
            int n2 = 1;
            System.out.print(n1 + " " + n2); //printing 0 and 1
            for (int i = 2; i < num; i++)//loop starts from 2 because 0 and 1 are already printed
            {
                sum = n1 + n2;
                System.out.print(" " + sum);
                n1 = n2;
                n2 = sum;
            }
            int n3 = sum + n1 + n2 - 1; //-1 Starts with 1 not zero
            System.out.print("\nHasil Bilangan Fibonacci = " + n3);

            //Tanya user untuk mengulang perhitungan atau tidak
            System.out.print("\n Anda ingin mengulang [y/t] : ");
            exit_prog = scan.nextLine();


        }while (!exit_prog.equals("T") && !exit_prog.equals("t"));
    }

}
