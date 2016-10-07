package Day10;

import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String binStr = Integer.toBinaryString(scanner.nextInt());

        int result = 0;
        String[] strArray = binStr.split("0");
        for (String aStrArray : strArray) {
            if (aStrArray.length() > result)
                result = aStrArray.length();
        }
        System.out.println(result);
    }
}
