package Step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step07_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int max = -1;
        int a = 0;
        int b = 0;
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(max < num){
                    max = num;
                    a = i+1;
                    b = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(a+" "+b);
    }
}
