/*
 * Name
 * ID
 * Salary (Float)
 * Pan Card
 * Use Constructor Chaining (Create A Object With All Parameters & Use Chaining To Initialise Object)
 */
class Employee{
    String name="",pan="";
    double salary=0.0;
    int id=0;
    Employee(String name){
        this.name=name;
    }
    public static void main(String args[]){
        Pan p=new Pan("CJIPN",2101,210000.0,"Ved");
        p.display();
    }
}
class Salary extends Employee{
    Salary(double salary,String name){
        super(name);
        this.salary=salary;
    }
}
class Id extends Salary{
    Id(int id,double salary,String name){
        super(salary,name);
        this.id=id;
    }
}
class Pan extends Id{
    Pan(String pan,int id,double salary,String name){
        super(id,salary,name);
        this.pan=pan;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Pan Card: "+pan);
    }
    
}