package integerarrayofsize10;

import java.util.Scanner;

public class Printevennumbers {


	public static void main(String[] args) {

		int a[]=new int[10];
//declaring an array of int type and set its size
		System.out.println("Even numbers:");
		
		for(int i=1;i<a.length;i++)
//the values start from i=1 and it will go until i is grater than the length of an array and the i value will be incremented 
		{
			if(i%2==0)
//When we divide the value with 2 and the answer will be equal to 0 then the logical will be for even number
			{
				System.out.println(i);
				//here it will print i values
			}
		}
	}

}