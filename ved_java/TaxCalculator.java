//  2.5l - no tx
//  2.5l - 3l -> 10% exc
//  3l to 4l -> 5000 + 20% exc
//  above 4l -> 25000 + 30% exc
import java.util.*;

class TaxCalculator{

    int pan; 
    String name;
    int taxIncome;
    double tax;

    void inputInfo(String name, int pan, int taxIncome ){
        this.name = name;
        this.pan = pan;
        this.taxIncome = taxIncome;
    }

    void taxCalculation(){
        if(taxIncome <= 250000)
        tax=0;
        else if(taxIncome>250000 && taxIncome <= 300000){
            tax = 0.10*(taxIncome-250000);
        }
        else if(taxIncome>300000 && taxIncome <= 400000){
            tax=0.20 * (taxIncome-300000) + 5000;
        }
        else if(taxIncome>400000){
            tax = 0.30 * (taxIncome-400000) + 25000;
        }
    }

    void display(){
        System.out.println("Name : " + name + ", Pan : "+ pan + ", Tax Income : " + taxIncome + ", tax : " + tax);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TaxCalculator user = new TaxCalculator();
        
        String name = sc.next();
        int pan = sc.nextInt();
        int taxIncome = sc.nextInt();

        user.inputInfo(name, pan, taxIncome);
        user.taxCalculation();
        user.display();

    }

}