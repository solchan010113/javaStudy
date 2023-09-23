package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step06_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int num = 0;
        for(int i = 0; i<a.length/2; i ++){
            if(a[i] == a[a.length-i-1]) {
                num++;
            }
        }
        System.out.println(num==a.length/2?1:0);
    }
}
