package Step02;

import java.io.*;

public class Step_02_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();

        String[] a = st.split(" ");
        int A = Integer.parseInt(a[0]);
        int B = Integer.parseInt(a[1]);
        String str = "";

        if(A>B) {
            str = ">";
        } else if (A<B) {
            str = "<";
        } else {
            str = "==";
        }
        bw.write(str);

        bw.flush();

        bw.close();
        br.close();
    }
}
