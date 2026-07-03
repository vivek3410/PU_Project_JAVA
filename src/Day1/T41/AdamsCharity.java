package Day1.T41;

import java.util.Scanner;

public class AdamsCharity {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double total = 0;

        for(int i = 1;i<=n;i++){
            total = total + Math.pow(i, 2);
        }

        System.out.println(total);
    }
}
