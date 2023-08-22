package Step02;

import java.io.*;

public class Step_02_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int A = Integer.parseInt(br.readLine());

        if(A >= 90) {
            str = "A";
        } else if (A >= 80) {
            str = "B";
        } else if (A >= 70) {
            str = "C";
        } else if (A >= 60) {
            str = "D";
        } else {
            str = "F";
        }

        System.out.println(str);

    }
}
