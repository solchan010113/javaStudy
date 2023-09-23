package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step09_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int min = 10001;
        int sum = 0;
        for(int i = a; i <= b; i++) {
            boolean chk = true;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    chk = true;
                    break;
                }
                chk = false;
            }
            if(!chk || i == 2){
                if(min > i) {
                    min = i;
                }
                sum += i;
            }
        }
        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }

    }
}
