package bai_thuc_hanh;
import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {       
        Scanner myOjbScanner = new Scanner(System.in);
        System.out.print("Nhap n: "); 
        int  SoDu, tong = 0;       
        int n = myOjbScanner.nextInt();
        while (n > 0) {
            SoDu = n % 10;
            n = n / 10;
            tong += SoDu;
        }
    System.out.println("Tong cac chu so = " + tong);
    }
} 

