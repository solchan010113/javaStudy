package Step02;

import java.io.*;
import java.util.StringTokenizer;

public class Step_02_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        B += C;
        if(B > 59) {
            A += 1*(B/60);
            B -= 60*(B/60);
            if (A > 23) {
                A -= 24;
            }
        }
        System.out.println(A+" "+B);

    }
}
