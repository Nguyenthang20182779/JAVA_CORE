/*package myPack;
import pack.*;

public class Simple {
    public static void main(String[] args) {
        A a = new A();
        a.msg();
        System.out.println(a.data);
    }
}

 */


package myPack;
import pack.*;
class B extends A{
    public static void main(String args[]){
        B obj = new B();
        obj.msg();
    }
}