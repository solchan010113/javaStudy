package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        for(int i = 1; i<=line; i++) {
            String str = " ".repeat(line-i);
            str += "*".repeat(i);
            System.out.println(str);
        }
    }
}
