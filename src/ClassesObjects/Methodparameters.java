package ClassesObjects;

public class Methodparameters {
    static void sayHello(String name){
        System.out.println ("Hello " + name);
    }

    public static void main ( String[] args ) {
        sayHello ( "David" );
        sayHello ( "Amy" );
    }
}