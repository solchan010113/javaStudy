package Step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step08_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        char[] arr = st.nextToken().toCharArray();
        int b = Integer.parseInt(st.nextToken());
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A'){
                num += (arr[i] - 55)*((int)Math.pow(b,(arr.length-i-1)));
            } else {
                num += (arr[i] - 48)*((int)Math.pow(b,(arr.length-i-1)));
            }
        }
        System.out.println(num);
    }
}
