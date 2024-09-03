
package assingment.pkg5;

import java.util.ArrayList;
import java.util.Scanner;


public class nhapmangsonguyen {

    
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();
       EnterData(numbers);
       System.out.println("danh sach so nguyen: " + numbers);
    }
    public static void EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("nhap so luong phan tu: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
}
}
}
