package ex_02_java_Basic_part2;

public class Smallest_num_Array {
    public static void main(String[] args){
        int arr[] ={2,9,1,3,7,4,8,6,5};
        int smallest_number = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i]<=smallest_number){
                smallest_number = arr[i];
            }
        }
        System.out.println("The Smallest Number in the given Array is " + smallest_number);
    }
}
