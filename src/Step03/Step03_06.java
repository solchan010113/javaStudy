package Step03;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Step03_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        for(int i = 0; i<A; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(str.nextToken())+Integer.parseInt(str.nextToken())+"\n");
        }
        bw.flush();

        br.close();
        bw.close();

    }
}
