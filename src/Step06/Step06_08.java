package Step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Step06_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Object[][] objArr = {{"A+","A0","B+","B0","C+","C0","D+","D0","F"},{4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0}};
        StringTokenizer stk = null;
        int cnt = 0;
        double total = 0;
        double totalc = 0;
        String str = "";
        while((str = br.readLine()) != null){
            stk = new StringTokenizer(str);
            stk.nextToken();
            double a = Float.parseFloat(stk.nextToken());
            String b = stk.nextToken();
            for(int i = 0; i < objArr[0].length; i++){
                if(b.equals(objArr[0][i]) && !"P".equals(b)){
                    totalc += a;
                    total += (double)objArr[1][i]*a;
                    break;
                }
            }
        }
        System.out.println(String.format("%.6f",total/totalc));
    }
}
