package referencelambda.eightthirty;
interface Num{
    public boolean m1(int i);
}
public class primeNumberwithLE {
    public static void main(String args[]){
        Num A=(i)->{
            if(i<=1) {
                return false;
            }
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    return false;
                }
            }
            return true;
        };
        for(int i=2;i<=100;i++){
            if(A.m1(i)){
                System.out.print(i+ ",");
            }
        }
    }
}