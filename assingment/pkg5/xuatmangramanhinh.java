
package assingment.pkg5;

import java.util.ArrayList;


public class xuatmangramanhinh {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
       DisplayData(numbers);
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("danh sach trong");
            return;
    }
         System.out.println("danh sach so nguyen:");
        for (int number : numbers) {
            System.out.println(number);
}
    }
}
