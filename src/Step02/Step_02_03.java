package Step02;

import java.io.*;

public class Step_02_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        int B;
        if(A%4==0 && A%100!=0 || A%400==0 ) {
            B = 1;
        } else {
            B = 0;
        }
        System.out.println(B);

        br.close();
    }
}
