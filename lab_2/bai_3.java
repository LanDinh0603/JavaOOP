package lab_2;
import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner myObjScanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String m = myObjScanner.nextLine();
        System.out.print("Nhap so tuoi: ");
        int n = myObjScanner.nextInt();
        
        if (n < 16) {
            System.out.println (m + " o do tuoi vi thanh nien");
        } else if (n >= 16 && n < 18) {
            System.out.println (m + " o do tuoi truong thanh");
        } else if (n >= 18) {
            System.out.println (m + " da gia");
        }
    }
}
