package Step02;

import java.io.*;
import java.util.StringTokenizer;

public class Step_02_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        B -= 45;
        if(B < 0) {
            B += 60;
            A -= 1;
            if (A < 0) {
                A = 23;
            }
        }
        System.out.println(A+" "+B);
    }
}
