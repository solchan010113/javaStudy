package Step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step07_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  null;
        int a = Integer.parseInt(br.readLine());
        int sum = 0;


        int[][][] arr = new int[a][100][100];

        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j < x+10; j++ ){
                for(int k = y; k < y+10; k++){
                    boolean chk = false;
                    for(int c = 0; c < i; c++) {
                        if(arr[c][j][k] == 1){
                            chk = true;
                            break;
                        }
                    }
                    if (!chk) {
                        arr[i][j][k] = 1;
                        sum ++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
