package oopLap6;

public class myStrBuffer {

    public static void main(String[] args) {
        //String Buffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("To");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(0,4,"University Of");
        System.out.println(buffer);
        System.out.println(buffer.reverse());
        buffer.setCharAt(0, 'T');
        System.out.println(buffer);

    }//main

}//class
