package DataTypesAndVariablesEx;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(num>0){
            int current = num%10;
            sum +=current;
            num/=10;
           // System.out.println(num);
        }
        System.out.println(sum);

    }
}