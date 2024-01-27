package bai_thuc_hanh;
import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        Scanner myObjScanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = myObjScanner.nextInt();
        System.out.print("Nhap m: ");  
        int m = myObjScanner.nextInt();     
        if(n > m) {
            System.out.println("So be nhat la: " + m);
        } else if (n == m){
            System.out.println("2 so bang nhau");
        } else {
         System.out.println("So be nhat la: " + n);
        }
    }
}