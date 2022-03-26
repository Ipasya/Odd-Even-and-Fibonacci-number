import java.util.Scanner;
public class Tugas2 {

    static int scanInt(Scanner scan, int min, int max) {
        String in;
        int result = 0;
        boolean isValid = false;

        do {
            in = scan.nextLine();

            isValid = true;

            try { 
                result = Integer.parseInt(in); 
            }  
            catch (NumberFormatException e) { 
                System.out.println("Input tidak valid! Harus berupa angka. (Ctrl+C untuk keluar)");
                isValid = false;
            }

            if (isValid && (result < min || result > max)) {
                System.out.printf("Input tidak valid! Minimal %d , maksimal %d. (Ctrl+C untuk keluar)\n", min, max);
                isValid = false;
            }

            if (!isValid) {
                System.out.print("Coba lagi: ");
            }

        } while (!isValid);

        return result;
    }

    static boolean promptRetry(Scanner scan) {
        boolean result = false;
        boolean isValid = false;
        do {
            //Tanya user untuk mengulangi perhitungan
            String exit_prog;
            System.out.print("\n Anda ingin mengulang [y/t] : ");
            exit_prog = scan.nextLine();

            if (exit_prog.equals("Y") || exit_prog.equals("y")) {
                result = true;
                isValid = true;
            }

            if (exit_prog.equals("T") || exit_prog.equals("t")) {
                result = false;
                isValid = true;
            }
        } while(!isValid);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean shouldRetry = false;

        // Input user data
        // nama
        String nama_mhs;
        boolean isNameValid = false;
        do {
            System.out.print("\nMasukkan Nama Anda [1..25 karakter] : ");
            nama_mhs = scan.nextLine();

            isNameValid = nama_mhs.length() > 0 && nama_mhs.length() <=25;

            if (!isNameValid) {
                System.out.println("Nama tidak valid! Nama harus 1..25 karakter. (Ctrl+C untuk keluar)");
            }
        } while (!isNameValid);

        // NIM
        String nim_mhs;
        boolean isNIMValid = false;
        do {
            System.out.print("\nMasukkan NIM Anda [10 karakter] : ");
            nim_mhs = scan.nextLine();

            isNIMValid = true;
            if (nim_mhs.length() != 10) {
                System.out.println("NIM tidak valid! Nama harus 10 karakter. (Ctrl+C untuk keluar)");
                isNIMValid = false;
            }

            try 
            { 
                Integer.parseInt(nim_mhs); 
            }  
            catch (NumberFormatException e)  
            { 
                System.out.println("NIM tidak valid! NIM berupa angka. (Ctrl+C untuk keluar)");
                isNIMValid = false;
            }

        } while (!isNIMValid);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        Nama menu
        System.out.println("Registrasi Sukses.....");
        System.out.println("Selamat datang " + nama_mhs + " [NIM :" + nim_mhs + "].. ^^__^^");
        System.out.println("Mari belajar macam-macam deret bilangan");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        var num for store variable input

        do {
            System.out.print("\n Masukkan Sembarang Angka [5..20] : ");
            int num = scanInt(scan, 5, 20);

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
            System.out.print("\nHasil Bilangan Fibonacci = " + n3 + "\n");

            shouldRetry = promptRetry(scan);

        } while (shouldRetry);
    }

}
