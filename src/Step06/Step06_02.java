package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step06_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1,1,2,2,2,8};
        for(int num : arr) {
            System.out.print(num - Integer.parseInt(st.nextToken())+" ");
        }
    }
}
