package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step09_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num = 0;
        int cnt = 0;

        for(int i = 1; i <= a; i++){
            if(a%i == 0) {
                cnt ++;
                if(cnt == b) {
                    num = i;
                }
            }
        }
        System.out.println(num);
    }
}
