
public class MainMethod 
{
	public static void main(String [] args)
	{
		int [] test1 = {1,5,3,8,2,5,4,10};
		double [] test2 = {8,4,6,2,10,52.35, 52.564,87,46.234};
		String [] test3 = {"wow", "omg", "you think this will work?", "nah man no way", "way to be positive", "well let's try it", "did this actually work? amazing.."};
		ArrayMethods1.insertionSort(test1);
		ArrayMethods1.selectionSort(test2);
		ArrayMethods1.bubbleSort(test3);
		printintArray(test1);
		printdoubleArray(test2);
		printstringArray(test3);
	}
	
	public static void printintArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printdoubleArray(double[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printstringArray(String[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
