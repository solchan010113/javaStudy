package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String b = "";
        while((a = br.readLine()) != null){
            b+=a+"\n";
        }
        System.out.println(b);
    }
}
