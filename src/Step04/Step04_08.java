package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Step04_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[10];
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine())%42;
            boolean check = true;

            for(int j=0; j<arr.size(); j++) {
                if(arr.get(j) == num) {
                    check = false;
                }
            }
            if(check) {
                arr.add(num);
            }
        }
        System.out.println(arr.size());
    }
}
