package referencelambda.eightthirty;

public class thisvsstatic {

        static int i=10;
        public void A(){
            System.out.println(this.i);
        }
    public static void main(String[] args){
            thisvsstatic a=new thisvsstatic();
    }
}
