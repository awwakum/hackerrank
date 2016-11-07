package Day25;

import java.util.Scanner;

/* https://www.hackerrank.com/challenges/30-running-time-and-complexity */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0; i<T; i++)
        {
            int nextInt = sc.nextInt();
            // Fast check if number is divisible by 2

            if (nextInt < 2 || (nextInt > 2 && (nextInt % 2) == 0)) System.out.println("Not prime");
            else
            {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(nextInt); j++)
                {
                    if (nextInt % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                System.out.println(isPrime?"Prime":"Not prime");
            }
        }
    }
}
