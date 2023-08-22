package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step04_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[28];

        for(int i=0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i<=30; i++) {
            boolean a = true;
            for(int j : arr) {
                if(i==j) {
                    a = false;
                }
            }
            if(a) {
                System.out.println(i);
            }
        }
    }
}
