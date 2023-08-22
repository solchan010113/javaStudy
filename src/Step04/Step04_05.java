package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step04_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[A];

        for(int i=0; i<B; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st2.nextToken());
            int w = Integer.parseInt(st2.nextToken());
            int r = Integer.parseInt(st2.nextToken());
            for(int j = q; j <= w; j++) {
                arr[j-1] = r;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
