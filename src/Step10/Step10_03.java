package Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step10_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine());
        int a3 = Integer.parseInt(st.nextToken());
        int b3 = Integer.parseInt(st.nextToken());
        if(a1 != a2 && a2 == a3){
            System.out.print(a1+" ");
        } else if (a1 == a2 && a2 != a3) {
            System.out.print(a3+" ");
        } else {
            System.out.print(a2+" ");
        }

        if(b1 != b2 && b2 == b3){
            System.out.print(b1);
        } else if (b1 == b2 && b2 != b3) {
            System.out.print(b3);
        } else {
            System.out.print(b2);
        }

    }
}
