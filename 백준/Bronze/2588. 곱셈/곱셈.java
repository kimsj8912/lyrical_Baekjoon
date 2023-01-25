import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int first = (int)(b/100);
        int second = (int)((b - first*100)/10);
        int third = b - (first*100 + second*10);

        int p = a*third;
        int q = a*second;
        int r = a*first;

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.print(p + q*10 + r*100);

        sc.close();

    }
}