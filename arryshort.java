public class arryshort {

public static void arrypoint(int arr[]){
      for(int f=0; f<arr.length-1; f++){
            System.out.println(arr[f]);
      }
      System.out.println();}


      public static void main(String[] args) {
      int arr[]={7,8,2,3,7};
      for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                  if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        System.out.println(arr[j+1]);
                  }
            }
      }
           arrypoint(arr);
}      
}
