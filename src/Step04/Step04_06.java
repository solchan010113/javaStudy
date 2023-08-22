package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step04_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arr = new int[A];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<B; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st2.nextToken());
            int D = Integer.parseInt(st2.nextToken());
            int num = arr[C-1];
            arr[C-1] = arr[D-1];
            arr[D-1] = num;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }


    }
}
