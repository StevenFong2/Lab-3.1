
public class ArrayMethods1 
{
	
	public static void swapint(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swapdouble(double[] arr, int index1, int index2)
	{
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swapstring(String[] arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	static int []ran = {1,8,9,4,20};
	
	public static void insertionSort(int[] list1)
	{
		for (int i = 0; i < list1.length - 1; i++)
		{
			for (int j = i + 1; j < list1.length; j++)
			{	
				if (list1[i] > list1[j])
				{
					swapint(list1, i, j);
				}
			}
		}
	}
	
	public static void selectionSort(double[] list1)
	{
		for (int i = 0; i < list1.length - 1; i++)
		{
			if (list1[i + 1] < list1[i])
			{
				swapdouble(list1, i, i + 1);
				int j = i;
				while (j > 0)
				{
					if (list1[j] < list1[j - 1])
					{
						swapdouble(list1, j, j - 1);
					}
					else
					{
						break;
					}
					j--;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		int length = list1.length;
		while (length > 0)
		{
			int i = 0;
			for (int j = i + 1; j < length; j++)
			{
				if (list1[i].compareTo(list1[j]) > 0)
				{
					swapstring(list1, j , i);
				}
				i = j;
			}
			length--;
		}
	}
}
