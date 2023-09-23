package Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step10_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = Math.max(Math.max(a,b),c);
            if((a+b+c) == 0){
                break;
            } else if(max >= (a+b+c - max)){
                System.out.println("Invalid");
            }
            else if(a == b && b == c){
                System.out.println("Equilateral");
            } else if(a == b || b == c || a == c){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
