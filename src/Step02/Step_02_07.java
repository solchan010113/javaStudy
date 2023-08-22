package Step02;

import java.io.*;
import java.util.StringTokenizer;

public class Step_02_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int C = Integer.parseInt(str.nextToken());

        int D;

        if(A==B && B==C) {
            D = A * 1000 + 10000;
        } else if (A==B || B==C || A==C) {
            D = A==B ? 1000+A*100 : B==C ? 1000+B*100 : 1000+A*100;
        } else {
            D = A>B && A>C ? A * 100 : B > C ? B*100 : C*100;
        }
        System.out.println(D);
    }
}
