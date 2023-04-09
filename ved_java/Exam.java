/*
 * roll no|sub 1|sub 2|sub 3|Total|
 * 1      |     |   |  
 * 2      |     |   |
 * ...    |     |   |
 * ...    |     |   |
 * ..     |     |   |
 * 100    |     |   |
 * 
 * Write a program to read the data and determine the following 
 * 1. Total Marks Of Each Student
 * 2. The highest marks in each subject and roll no of that student who secured it 
 * 3. The student who obtained the highest total marks.
 */
import java.util.*;
class Exam{
    int number;
    int subject1;
    int subject2;
    int subject3;
    int total;
    int highestSub1=0;
    int highestSub2=0;
    int highestSub3=0;
    int highestTotal=0;
    void setNumber(int number){
        this.number = number;
    }
    void setSubject1(int marks){
        this.subject1 = marks;
    }
    void setSubject2(int marks){
        this.subject2 = marks;
    }
    void setSubject3(int marks){
        this.subject3 = marks;
    }
    void calcTotal(){
        total=subject1+subject2+subject3;
    }
    void maxSub1(){
        if (subject1>highestSub1){
            this.highestSub1=subject1;
        }
    }
    void maxSub2(){
        if (subject2>highestSub2){
            this.highestSub2=subject2;
        }
    }
    void maxSub3(){
        if (subject3>highestSub3){
            this.highestSub3=subject3;
        }
    }
    void maxTotal(){
        if (total>highestTotal){
            this.highestTotal=total;
        }
    }
    public static void main(String args[]){
        Exam e=new Exam();
        int roll[]=new int[3];
        int sub1[]=new int[3];
        int sub2[]=new int[3];
        int sub3[]=new int[3];
        int total[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("Enter Roll Number");
            roll[i]=sc.nextInt();
            e.setNumber(roll[i]);
            System.out.println("Enter Marks Of Subject 1");
            roll[i]=sc.nextInt();
            e.setSubject1(sub1[i]);
            System.out.println("Enter Marks Of Subject 2");
            roll[i]=sc.nextInt();
            e.setSubject1(sub2[i]);
            System.out.println("Enter Marks Of Subject 3");
            roll[i]=sc.nextInt();
            e.setSubject1(sub3[i]);
            e.calcTotal();
            e.maxSub1();
            e.maxSub2();
            e.maxSub3();
            e.maxTotal();
        }
        System.out.println("Roll No\tSubject 1\tSubject 2\tSubject 3\tTotal");
        for (int i=0;i<3;i++){
            System.out.println(roll[i]+"\t"+sub1[i]+"\t"+sub2[i]+"\t"+sub3[i]+"\t"+total[i]);
        }
        System.out.println("Highest Marks In Subject 1: "+e.highestSub1);
        System.out.println("Highest Marks In Subject 2: "+e.highestSub2);
        System.out.println("Highest Marks In Subject 3: "+e.highestSub3);
        System.out.println("Highest Total Marks: "+e.highestTotal);
        
    }
}