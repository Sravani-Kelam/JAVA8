package referencelambda.eightthirty;

public class greatestthreenumbers {
    public static void main(String args[]){
        int a=67;
        int b=23;
        int c=987;
        if(a<b&&a<c){
            System.out.println("given number is:" +a);
        }
        else if(b<c && b<a){
            System.out.println("given number is:" +b);
        }
        else{
            System.out.println("the greatest number is:"+c);
        }
    }
}
