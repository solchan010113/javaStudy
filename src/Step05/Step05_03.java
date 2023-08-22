package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for(int i=0; i<A; i++){
            String str = br.readLine();
            System.out.print(str.substring(0,1)+str.substring(str.length()-1,str.length())+"\n");
        }
    }
}
