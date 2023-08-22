package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step03_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        for(int i=1; i<=A; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(str.nextToken());
            int num2 = Integer.parseInt(str.nextToken());
            System.out.println("Case #"+i+": "+num1+" + "+num2+" = "+(num1+num2));
        }

    }
}
