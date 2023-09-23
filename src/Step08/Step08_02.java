package Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        while(a > 0){
            int c = a % b;
            a = a/b;
            if(c > 9){
                sb.append((char)(c+55));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.reverse());
    }
}
