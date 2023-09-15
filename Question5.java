
package labsheet6;

public class Question5 {
     public static <T> void swap(T[] arr,int first,int second){
        T temp;
        temp=  arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    
}
    public static void main(String[] args) {
        Integer[] arrr={1,2,3,4,5};
        
        System.out.println("before swap array:");
        for(int i:arrr){
            System.out.println(i);
        }
        swap(arrr, 0, 1);
         System.out.println("before swap array:");
        for(int i:arrr){
            System.out.println(i);
        }
    }
}
