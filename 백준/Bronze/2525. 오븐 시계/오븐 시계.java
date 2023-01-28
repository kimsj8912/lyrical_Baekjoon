import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int total = c+m;

        if (total >= 60) {
            m = total%60;
            h += (int)(total-m)/60;
            if(h>=24) {
                h -= 24;
            }
        }
        else {
            m = total;
        }

        System.out.print(h + " " + m);

        sc.close();
    }
}