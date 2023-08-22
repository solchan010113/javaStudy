package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int num = 0;
        String str = br.readLine();
        for(int j=0; j < str.length(); j++) {
            num += Integer.parseInt(str.substring(j,j+1));
        }

        System.out.print(num);
    }
}
