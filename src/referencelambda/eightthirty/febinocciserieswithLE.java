package referencelambda.eightthirty;

    interface Fibonacci{
        public void m1(int count);
    }
    public class febinocciserieswithLE {
        public static void main(String args[]){
            Fibonacci f=(count)->{
                int a=0,b=1,c;
                System.out.print(a+","+b);
                for(int i=2;i<count;i++){
                    c=a+b;
                    System.out.print("," +c);
                    a=b;
                    b=c;
                }
                System.out.println();
            };
            f.m1(10);
        }
    }

