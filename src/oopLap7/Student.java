package oopLap7;

//design class
//taking about Student
//1. student id
//2. name
//3. major
//4. group

public class Student {
    public static String faculty = "Management Technology"; //public ตัวแปลนี้คลาสอื่นสามารถมองเห็นได้
    private String id;  //private ตัวแปลนี้คลาสอื่นไม่สามารถมองเห็นได้
    private String name;
    private String major;
    private String group;
    //ถ้าต้องการใช้งานผ่าน 4 ตัวนี้ต้องใช้งานผ่าน class

    //constructor
    //default
    public Student(){} //แบบต้องพิมพ์เอง
    public Student(String id,String n,String m,String g){
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }// condtructor //แบบไม่ต้องพิมพ์เอง

    //getter and srtter methods
    //id
    public void setId(String id){
        this.id = id;
    }//setID //ใช้ในการเซตค่าของรหัส
    public String getId(){
        return  this.id;
    }//getID //การอ่านค่า

    public void setname(String n){
        this.name = n;
    }//setname
    public String getname(){
        return  this.name;
    }//getname

    public void setmajor(String m){
        this.major = m;
    }//setmajor
    public String getmajor(){
        return  this.major;
    }//getmajor

    public void setgroup(String g){
        this.group = g;
    }//setgroup
    public String getgroup(){
        return  this.group;
    }//getgroup
//ไม่สามารถรันได้

}//class