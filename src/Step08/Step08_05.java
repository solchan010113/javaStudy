package Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int num = 0;
        int b = 6;
        while(a > 1){
            num++;
            a -= b;
            b += 6;
        }
        System.out.println(num+1);
    }
}
