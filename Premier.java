import java.io.*;
import static java.lang.System.*;

public class Premier{
    public static void main(String[] args) {
        int max = 1000000000;
        int tmp = 0;
        int j;
        boolean arr []= new boolean[max];
        long t1 = currentTimeMillis();
        for(int i = 2; i < max; i+=2){
            if(arr[i])
                continue;
            tmp++;
            for(j = i*2 ; j < max; j= j+i){
                    arr[j]=true;
                }
            if(i == 2)
                i--;
            }
            
            
        System.out.println(tmp);    
        System.out.println(currentTimeMillis()-t1); 
    } 
}