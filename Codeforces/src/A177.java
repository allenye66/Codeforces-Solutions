import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A177 {
	static boolean[][] noolean;
	static int size;
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		size = scan.nextInt();
		int[][] arr = new int[size][size];
		noolean = new boolean[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		 int sum=0;
	        for(int i=0;i<size;i++)
	        {
	            for(int j=0;j<size;j++)
	            {
	                if(noolean[i][j]!= true)
	                {
	                    if(i==j)
	                    {
	                        sum+=arr[i][j];
	                        noolean[i][j]=true;
	                    }
	                    else if(i+j==size-1)
	                    {
	                        sum+=arr[i][j];
	                        noolean[i][j]= true;
	                    }
	                    else if(i==(size-1)/2)
	                    {
	                        sum+=arr[i][j];
	                        noolean[i][j]=true;
	                    }
	                    else if(j==(size-1)/2)
	                    {
	                        sum+=arr[i][j];
	                        noolean[i][j]=false;
	                    }
	                }
	            }
	        }
	        System.out.println(sum);

	}

	
	static void printBool() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(noolean[i][j] + " ");
			}

			System.out.println();
		}
	}
}