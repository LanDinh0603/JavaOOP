package bai_thuc_hanh;
import java.util.Scanner;

public class slide55 {
    public static void main(String[] args) {
        Scanner myObjScanner = new Scanner(System.in);
        System.out.println("cac so chia het cho 5 la: ");
        for (int i = 0; i <= 20; i++) {
            if(i % 5 != 0){
                continue;
            }
        System.out.println(i);
        }  
    }   
}
