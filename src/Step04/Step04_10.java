package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step04_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        float[] arr = new float[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        float num = 0;
        float sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(num < arr[i]){
                num = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/num*100;
            sum += arr[i];
        }
        System.out.println(sum/A);
    }
}
