package oopLap6;

import java.util.StringTokenizer;

public class myStrToken {

    public static void main(String[] args) {
        //StringTokenizer
        String msg = "Wellcome To RMUTSV";
        StringTokenizer mytoken = new StringTokenizer(msg);
        System.out.println(mytoken.countTokens());

        while (mytoken.hasMoreTokens()) {
            StringBuffer mybuff = new StringBuffer(mytoken.nextToken());
            System.out.print(mybuff.reverse()+" ");
        }

    }//main

}//class