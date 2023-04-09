import java.util.*;
class Board{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the number of units");
        int units=sc.nextInt();
        float bill=0.0f;
            if (units<=100){
                bill=units*60;
            }
            else if(units<=300){
                bill=100*60+(units-100)*80;
            }
            else{
                bill=100*60+200*80+(units-300)*90;
            }
            if (bill>=300){
                bill+=0.15*bill;
            }
            System.out.println("Name: "+name);
            System.out.println("Units: "+units);
            System.out.println("Bill: "+bill);
        }
    }