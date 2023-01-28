import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h == 0 && m < 45) {
            h = 23;
            m = 45 - m;
            m = 60 - m;
        }
        else {
            if (m>=45) {
                m -= 45;
            }
            else {
                m = 45 - m;
                m = 60 - m;
                h -= 1;
            }
        }

        System.out.print(h + " " + m);

        sc.close();
    }
}