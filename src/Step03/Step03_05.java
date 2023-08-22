package Step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step03_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine())/4;
        String str = "";
        for(int i =0; i<A; i++){
            str += "long ";
        }
        System.out.println(str+"int");
    }
}
