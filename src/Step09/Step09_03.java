package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step09_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int a = Integer.parseInt(br.readLine());
            int num = 0;
            String str = "";
            StringBuffer sb = new StringBuffer();
            if(a == -1) {
                return;
            }
            sb.append(a).append(" = 1");

            for(int i = 2; i < a; i++) {
                if(a%i == 0) {
                    sb.append(" + ");
                    sb.append(i);
                    num += i;
                }
            }

            str = sb.toString();
            if(num+1 != a) {
                str = a+" is NOT perfect.";
            }
            System.out.println(str);
        }

    }
}
