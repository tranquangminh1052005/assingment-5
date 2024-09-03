
package assingment.pkg5;

import java.util.ArrayList;


public class timgiatriphantulonthu2trongmang {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(35);
        numbers.add(1);
        numbers.add(10);
        numbers.add(34);
        numbers.add(35);
        int max2 = findMax2(numbers);
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Danh sách không đủ phần tử để tìm giá trị lớn thứ hai.");
        } else {
            System.out.println("Giá trị lớn thứ hai trong danh sách là: " + max2);
        }
    }
     public static int findMax2(ArrayList<Integer> numbers){
         if (numbers.size() < 2) {
            return Integer.MIN_VALUE;
     }
         int max1 = Integer.MIN_VALUE;
         int max2 = Integer.MIN_VALUE;
           for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number < max1) {
                max2 = number;
            }
            }
             if (max2 == Integer.MIN_VALUE) {
                 return Integer.MIN_VALUE;
             }
             return max2;
   }
}

