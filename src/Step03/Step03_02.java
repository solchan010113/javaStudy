package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step03_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        for(int i=0; i<A; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            System.out.println(Integer.parseInt(str.nextToken())+ Integer.parseInt(str.nextToken()));
        }

        br.close();
    }
}
