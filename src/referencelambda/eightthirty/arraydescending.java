package referencelambda.eightthirty;

public class arraydescending {
    public static void main(String[] args){
        int[] arr={3,6,74,5,2,9,8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num);
        }
    }
}
