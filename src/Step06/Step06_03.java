package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step06_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int n = a*2-1;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<n; i++) {
            int c = a+i;
            if (i >= a) {
                c = n-(i-a+1);
            }
            for(int j = 0; j<c; j++){
                if(j<(n-c)) {
                    str.append(" ");
                } else {
                    str.append("*");
                }
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
