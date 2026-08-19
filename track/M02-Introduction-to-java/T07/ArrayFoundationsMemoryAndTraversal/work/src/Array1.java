import java.util.Scanner;
public class Array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Array Elements");
        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
