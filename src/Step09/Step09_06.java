package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step09_06 {
    public static boolean calc(int num) {
        boolean chk = false;
        for(int i = 2; i < num; i++) {
            if(num%i == 0) {
                chk = true;
                break;
            }
            chk = false;
        }
        return chk;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        while (calc(a)) {
            for(int i = 2; i < a; i++) {
                if(a%i == 0) {
                    a /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
        if(a > 1) {
            System.out.println(a);
        }
    }
}
