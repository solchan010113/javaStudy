package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step04_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int q = ((j-e)+1)/2;
            int[] arr2 = new int[q];
            for (int x=0; x < q; x++){
                arr2[x] = arr[e-1+x];
                arr[e-1+x] = arr[j-1-x];
                arr[j-1-x] = arr2[x];
            }
        }
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
