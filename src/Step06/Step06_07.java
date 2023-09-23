package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step06_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String strCheck = "";
        int cntChk = 0;
        int cnt = 0;
        for(int i = 0; i < a; i++) {
            char[] carr = br.readLine().toCharArray();

            for(int j = 0; j < carr.length; j++){
                if(j == carr.length -1 || carr[j] != carr[j+1] ) {
                    strCheck += carr[j];
                }
            }
            for(char cha : strCheck.toCharArray()){
                long charCnt = strCheck.chars().filter(c -> c == cha).count();
                cntChk = 1;
                if(charCnt > 1 ) {
                    cntChk = 0;
                    break;
                }
            }
            cnt += cntChk;
            strCheck = "";
        }
        System.out.println(cnt);
    }
}
