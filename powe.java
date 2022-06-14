import java.util.*;
import java.math.*;

class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int n = sc.nextInt();
        System.out.print("Enter the number 2:");
        int p = sc.nextInt();
        if(isPower(n, p))
            System.out.println(n + " is a power of " + p);
        else
            System.out.println(n + " is not a power of " + p);

    }

    public static boolean isPower(int x, int y) {
        int res1 = (int) Math.log(y) /
                (int) Math.log(x);

        double res2 = Math.log(y) /
                Math.log(x);

        return (res1 == res2);
    }
}
