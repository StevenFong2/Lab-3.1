
public class MainMethod 
{
	public static void main(String [] args)
	{
		/*int [] test1 = {1,5,3,8,2,5,4,10};
		double [] test2 = {8,4,6,2,10,52.35, 52.564,87,46.234};
		String [] test3 = {"wow", "omg", "you think this will work?", "nah man no way", "way to be positive", "well let's try it", "did this actually work? amazing.."};
		*/
		
		int [] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double [] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String [] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		ArrayMethods1.insertionSort(test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		printdoubleArray(test2);
		//flipped insertion and selection.. oppss
		start = System.nanoTime();
		ArrayMethods1.selectionSort(test1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		printintArray(test1);
		
		start = System.nanoTime();
		ArrayMethods1.bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
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
