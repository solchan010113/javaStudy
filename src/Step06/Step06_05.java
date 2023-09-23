package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step06_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] carr = br.readLine().toUpperCase().toCharArray();
        int[] arr = new int[26];
        int max = 0;
        char str = 0;
        for(char c : carr){
            arr[c-65]++;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                str = (char)(i+65);
            } else if(max == arr[i]){
                str = '?';
            }
        }
        System.out.println(str);
    }
}
