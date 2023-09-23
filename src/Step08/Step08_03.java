package Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < a; i++){
            int num = Integer.parseInt(br.readLine());

            sb.append(num / 25).append(" ");
            num %= 25;
            sb.append(num / 10).append(" ");
            num %= 10;
            sb.append(num / 5).append(" ");
            num %= 5;
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
