package Step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step07_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        char[][] arr = new char[5][];
        for(int i = 0; i < 5; i++){
            char[] carr = br.readLine().toCharArray();
            if(max < carr.length){
                max = carr.length;
            }
            arr[i] = new char[carr.length];
            for(int j = 0; j < carr.length; j++){
                arr[i][j] = carr[j];
            }
        }

        for(int i = 0; i < max; i++){
            for(int j = 0; j < 5; j++) {
                if(arr[j].length > i){
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
