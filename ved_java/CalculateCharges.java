import java.util.*;

 class CalculateCharges{

    String name;
    int unit;
    double charges=50.0;

    
    void setName(String name){
        this.name = name;
    }

    void setUnit(int unit){
        this.unit = unit;
    }

    void calculateCharges(){
        if(unit <=100 ){
            charges += 0.60 * unit; 
        }
         else if(unit > 100 && unit <= 200){
            charges += 0.60 * 100 + 0.80*(unit-100); 
        }
        else if(unit > 300){
            charges += 0.60 * 100 + 0.80*200 + 0.90*(unit-300); 
        }
        if(charges > 300){
            charges += 0.15 * charges ;
        }
    }

    void display(){
        System.out.println("Name : " + name +  " , unit : " +  unit + " ,Charge : " + charges);
    }
   

    public static void main(String[] args){
        int numberOfUsers;
        System.out.println("Enter the number of users : ");

        Scanner sc = new Scanner(System.in);
        CalculateCharges user = new CalculateCharges();
        user.setName("Piyush");
        user.setUnit(600);
        user.calculateCharges();
        user.display();
        
    }
}