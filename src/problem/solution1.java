package problem;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class solution1 {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int arr1[]= new int[5];
        
        for(int i=0;i<5;i++){
            arr1[i]=0;
        }
        for(int j=0;j<arr.size();j++){
            if(arr.get(j)==1){
                arr1[0]++;
            }
            else if(arr.get(j)==2){
                arr1[1]++;
            }
             else if(arr.get(j)==3){
                arr1[2]++;
            }
             else if(arr.get(j)==4){
                arr1[3]++;
            }
             else if(arr.get(j)==4){
                arr1[4]++;
            }

        }
      
        int highest=arr1[0];
        List<Integer> s= new ArrayList<Integer>();
        System.out.println("list size="+s.size());
        int index;
        for(int i=1;i<5;i++){
            if(arr1[i]>highest){
                highest=arr1[i];
                s.add(i+1);

            }
        }
        System.out.println("highest="+highest);
        int result;
        System.out.println("list size="+s.size());
        if(s.size()>1){
            int lowest=s.get(0);
            for(int i=1;i<s.size();i++){
            if(s.get(i)<lowest){
                lowest=s.get(i);
            }
        }
        result=lowest;
        }
        else{
            result=s.get(0);
        }
        

        return result;

    }

    public static void main(String[] args) throws IOException {
       List<Integer> v=new ArrayList<Integer>();
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
       for(int i=0;i<n;i++){
    	   int m=scan.nextInt();
    	   v.add(m);
    	   
       }
       int result=migratoryBirds(v);
       System.out.print(result);
    }
}
