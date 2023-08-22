package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step04_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i=0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i ]== B){
                num++;
            }
        }
        System.out.println(num);
    }
}
