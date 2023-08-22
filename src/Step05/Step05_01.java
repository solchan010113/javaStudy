package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step05_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String B = br.readLine();
        int A = Integer.parseInt(br.readLine())-1;

        System.out.println(B.substring(A,A+1));

    }
}
