package Step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Step04_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[A];

        for(int i=0; i<A; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // 내림차순 정렬
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++) {
//                int cNum = arr[j];
//                if(arr.length-1 != j){
//                    if(cNum > arr[j+1]) {
//                        arr[j] = arr[j+1];
//                        arr[j+1] = cNum;
//                    }
//                }
//            }
//        }
        Arrays.sort(arr);
        System.out.println(arr[0]+ " " + arr[arr.length - 1]);
    }
}
