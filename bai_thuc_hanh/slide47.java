package bai_thuc_hanh;
import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        Scanner myObjScanner = new Scanner(System.in);
        int n, tong = 0;
        do {
            System.out.print("Nhap vao so nguyen bat ky: ");
            n = myObjScanner.nextInt();
            tong = n + tong; // tong += n;
        } while (tong < 100);
        System.out.println("Tong cac so nguyen vua nhap la: " + tong);   
    }   
}
