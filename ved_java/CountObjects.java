import java.util.*;

class CountObjects{
    static int count = 0;

    CountObjects(){
        count++;
    }

    public static void main(String args[]){
        CountObjects java = new CountObjects();
        CountObjects java1 = new CountObjects();
        CountObjects java2 = new CountObjects();
        CountObjects java3 = new CountObjects();
        System.out.println(count);
    }
}