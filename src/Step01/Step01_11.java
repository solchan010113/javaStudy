package Step01;

import java.util.Scanner;

public class Step01_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String[] AA = A.split(" ");

        long B = Long.parseLong(AA[0]);
        long C = Long.parseLong(AA[1]);
        long D = Long.parseLong(AA[2]);
        System.out.println(B+C+D);

    }
}
