package referencelambda.eightthirty;

public class prime {
    public static void main(String[] args){
        System.out.println("Prime numbers up to 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime=true;
               for(int j=2;j<i;j++){
                   if(i%j==0){
                       isPrime=false;
                       break;
            }
        }
               if(isPrime){
                   System.out.print(i+", ");
               }
        }
    }
}
