//  java development kit ,java runtime env , jvm 
//intro to java
//variables ,operators,type casting/promotion/conversion

//before jan 1


/*
public class hello {

    public static void main(String[] args) {
        System.out.println("hello world");

    }
}
 status

 */

 //something new




 //jan 2 (operators,)
    


 // jan3 

class clac{

    int a; //instance variables  , what class knows
    public int add(int a,int b){    // what class does,  behaviour
        return a+b;
    }
}
public class hello {

    public static void main(String[] args) {

        clac c= new clac(); // creaating object  named c  of type called as clac
        int r = c.add(2,3);
        System.out.println(r);

    }
}
