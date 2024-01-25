package bai_thuc_hanh;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        int a, b, tong, hieu, tich;
        double thuong;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b = scanner.nextInt();
         
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = a / b;

        System.out.println("tong: ", a + b);
        System.out.println("hieu: ", a - b);
        System.out.println("tich: ", a * b);
        System.out.println("thuong: ", a / b);
        
    }
}
