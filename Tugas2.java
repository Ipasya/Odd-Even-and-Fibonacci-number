import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Masukkan Sembarang Angka [5..20] : ");
        num = scan.nextInt();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\nDeret Bilangan" + "\n##############");
        System.out.print("\n " + num + " Bilangan Genap \n");
//Genap
        int sumGenap = 0;
        for (int i=1; i <= num * 2; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
                sumGenap += i;
            }
        }
        System.out.println(" \nHasil Bilangan Genap = " + sumGenap);
//Ganjil
        int sumGanjil = 0;
        for (int i=1; i <= num * 2; i++){
            if(i%2 == 1){
                System.out.print(i + " ");
                sumGanjil += i;
            }
        }
        System.out.println(" \nHasil Bilangan Genap = " + sumGanjil);
//Fibanocci
        int sum = 0;
        int n1 = 1;
        int n2 = 1;
        System.out.print(n1+" "+n2); //printing 0 and 1
        for(int i=2;i<num;i++)//loop starts from 2 because 0 and 1 are already printed
        {
                sum = n1+ n2;
                System.out.print(" "+ sum);
                n1 = n2;
                n2 = sum;
        }
        int n3 = sum + n1 + n2 - 1; //-1 Starts with 1 not zero
        System.out.print("\nHasil Bilangan Fibonacci = " + n3);
    }
}
