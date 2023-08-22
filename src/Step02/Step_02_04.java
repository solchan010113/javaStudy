package Step02;

import java.io.*;

public class Step_02_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C ;
        if(A > 0 && B > 0){
            C = 1;
        } else if(A > 0 && B < 0){
            C = 4;
        } else if(A < 0 && B < 0){
            C = 3;
        } else {
            C = 2;
        }

        System.out.println(C);
    }
}
