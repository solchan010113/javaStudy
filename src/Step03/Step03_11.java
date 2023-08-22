package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step03_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(str.nextToken());
            int num2 = Integer.parseInt(str.nextToken());
            int sum = num1 + num2;
            if(sum == 0) {
                break;
            }
            System.out.println(sum);
        }
    }
}
