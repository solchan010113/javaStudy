package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step03_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strt;
        String str = "";
        while ((str = br.readLine())!=null){
            strt = new StringTokenizer(str);
            int num1 = Integer.parseInt(strt.nextToken());
            int num2 = Integer.parseInt(strt.nextToken());
            int sum = num1 + num2;
            System.out.println(sum);
        }

    }
}
