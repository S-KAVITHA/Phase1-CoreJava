package arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimentionalArray
{

	public static void main(String[] args)
	{
	//multi dimensional arrays has rows and columns.
		
		int[][] numbers = { {2,4,6,8} , {3,5,9,11}};
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println("-------------------");
		for(int row=0; row <numbers.length; row++)
		{
			//System.out.println(numbers.length);
			System.out.println(Arrays.toString(numbers[row]));
			
			for(int col=0 ; col <numbers[row].length; col++)
			{
				
				System.out.println("Row : " +row +" Col : "+ col + " data :> " +numbers[row][col]);
			}
			//System.out.println(numbers[row].length);
		}
	}
}