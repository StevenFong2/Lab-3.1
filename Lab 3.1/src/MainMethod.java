//Steven Fong
//AP Java Period 2
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
		ArrayMethods1.insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		printArray(test1);
		
		start = System.nanoTime();
		ArrayMethods1.selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		printArray(test2);
		
		start = System.nanoTime();
		ArrayMethods1.bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		printArray(test3);

	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printArray(double[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printArray(String[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
