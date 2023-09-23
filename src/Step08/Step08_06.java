package Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int num = 0;
        int cnt = 0;
        while(a > num) {
            cnt ++;
            num += cnt;
        }
        int child = num%a+1;
        int parent = cnt - num%a;
        if (cnt%2 == 1){
            child = cnt - num%a;
            parent = num%a+1;
        }
        System.out.println(parent+"/"+child);
    }
}
