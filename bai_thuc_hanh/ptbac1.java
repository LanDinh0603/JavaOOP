package bai_thuc_hanh;
import java.util.Scanner;

public class ptbac1 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem: ");
            } else {
                System.out.println("Phuong trinh vo nghiem: ");
            }
        } else {
            float x = (float) -b / a;
            System.out.println("Phuong trinh co mot nghiem: " + x);
        } 
    }
}