package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Step04_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st1.nextToken());
        int B = Integer.parseInt(st1.nextToken());

        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<A; i++) {
            arr.add(Integer.parseInt(st2.nextToken()));
        }

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) < B) {
                System.out.print(arr.get(i)+" ");
            }
        }
    }
}
