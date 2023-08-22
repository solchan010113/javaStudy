package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step04_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int a = 0;
        int b = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(a < arr[i]) {
                a = arr[i];
                b = i+1;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
