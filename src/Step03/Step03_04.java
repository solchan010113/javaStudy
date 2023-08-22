package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step03_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        for(int i=0; i<B; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            A -= Integer.parseInt(str.nextToken()) * Integer.parseInt(str.nextToken());
        }

        if(A == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
