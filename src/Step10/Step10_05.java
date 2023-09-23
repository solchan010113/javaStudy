package Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step10_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int a = Integer.parseInt(br.readLine());
        int minX = 10001;
        int minY = 10001;
        int maxX = -10001;
        int maxY = -10001;
        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(minX > x) {
                minX = x;
            }
            if(minY > y) {
                minY = y;
            }
            if(maxX < x) {
                maxX = x;
            }
            if(maxY < y) {
                maxY = y;
            }
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
