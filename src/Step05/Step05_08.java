package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 0;
        String strTrim = "";
        boolean check = false;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' ' && check==false){
                check = true;
                num++;
            } else if (str.charAt(i) == ' ') {
                check = false;
            }
        }
        System.out.println(num);
    }
}
