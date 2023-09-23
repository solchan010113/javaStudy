package Step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step09_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            for(int j = 2; j < num; j++){
                if(num%j == 0){
                    cnt++;
                    break;
                }
            }
            if(num == 1) {
                cnt++;
            }
        }
        System.out.println(a - cnt);
    }
}
