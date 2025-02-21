package referencelambda;

import java.util.function.Supplier;

public class constructorreference {
    constructorreference(){
        System.out.println("hello is created nice to meet you");
    }
    public static void main(String args[]){
        Supplier<constructorreference> s=()->new constructorreference(); //using lambda expression
        Supplier<constructorreference> s2=constructorreference::new; //constructor reference
        s.get();
        s2.get();
    }
}
