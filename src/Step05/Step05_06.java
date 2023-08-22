package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        char[] arr = A.toCharArray();
        for (char i='a'; i<='z'; i++ ){
            int index = -1;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == i){
                    index = j;
                    break;
                }
            }
            System.out.print(index+" ");
        }
    }
}
