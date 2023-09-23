package Step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int sec = 0;
        int totalSec = 0;
        for (char ac : a.toCharArray()){
            sec = (ac-65)/3;
            if(ac>=80 && ac <= 83){
                sec = 5;
            }
            else if (ac>=84 && ac <= 86)
                sec = 6;
            else if(ac>=87 && ac <= 90)
                sec = 7;
            totalSec += sec + 3;
        }
        System.out.println(totalSec);
    }
}
