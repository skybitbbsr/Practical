import java.util.Scanner;public class ArrayApp {    public static void main(String[] args) {        int number[],index=0;        Scanner sc=new Scanner(System.in);        System.out.println("Howmany Numbers?");        int size=sc.nextInt();        number=new int[size];        System.out.println("Enter the numbers:");        for(int i=0;i<size;i++)            number[index++]=sc.nextInt();        ArrayOperation array=new ArrayOperation();        array.setNumbers(number,index);        int even=array.evenSum();        int odd=array.oddSum();        int largest=array.largest();        int smallest=array.smallest();        //System.out.println("The Sum Of Even Numbers Is : "+even);        //System.out.println("The Sum Of Odd Numbers Is : "+odd);        System.out.println("The Largest Numbers Is : "+largest);        System.out.println("The Smallest Numbers Is : "+smallest);    }}