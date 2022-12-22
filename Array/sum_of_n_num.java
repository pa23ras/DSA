
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();//rotations
    int q = scn.nextInt();
    
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }

    int[] queries = new int[q];
    for(int i = 0; i < q; i++){
      queries[i] = scn.nextInt();
    }
    
  ////Actual code start
    int[] ansArr = new int[n];
    for(int i = 0; i < n; i++){
      int newIdx = (i + k)%n;
      ansArr[newIdx] = arr[i];
    }
    
    for(int i = 0; i < queries.length; i++){
      int idx = queries[i];
      System.out.print(ansArr[idx] + " ");
    }
    
	}
}


