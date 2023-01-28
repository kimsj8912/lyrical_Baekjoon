import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = 0;
        int same = 0;

        if (a == b) {
            total++;
            same = a;
        }
        if (b == c) {
            total++;
            same = b;
        }
        if (a == c) {
            total++;
            same = c;
        }
        if (a == b && b == c) {
            total--;
        }

        if (total == 0) {
            int big = a;
            if (b>big) {
                big = b;
            }
            if (c>big) {
                big = c;
            }

            System.out.print(big * 100);
        }
        else if (total == 1) {
            System.out.print(1000 + 100 * same);
        }
        else if (total == 2) {
            System.out.print(10000 + 1000 * same);
        }

        sc.close();
    }
}