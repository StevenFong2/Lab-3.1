
public class ArrayMethods1 
{
	
	public static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(double[] arr, int index1, int index2)
	{
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(String[] arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	static int []ran = {1,8,9,4,20};
	
	public static void selectionSort(double[] list1)
	{
		for (int i = 0; i < list1.length - 1; i++)
		{
			for (int j = i + 1; j < list1.length; j++)
			{	
				if (list1[i] > list1[j])
				{
					swap(list1, i, j);
				}
			}
		}
		
		//Another way?
		
		/*for (int i = 0; i < list1.length - 1; i++)
		{
			int m = i;
			for (int j = i + 1; j < list1.length; j++)
			{
				if (list1[m] > list1[j])
				{
					m = j;
				}
			}
			swap(list1, i, m);
		}*/
	}
	
	public static void insertionSort(int[] list1)
	{
		for (int i = 1; i < list1.length; i++)
		{
			int j = i;
			while (j > 0)
			{
				if (list1[j] < list1[j - 1])
				{
					swap(list1, j, j - 1);
					j--;
				}
				else
				{
					break;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		/*int length = list1.length;
		while (length > 0)
		{
			int i = 0;
			for (int j = i + 1; j < length; j++)
			{
				if (list1[i].compareTo(list1[j]) > 0)
				{
					swap(list1, j , i);
				}
				i = j;
			}
			length--;
		}*/
		
		int swap = 1;
		int length = list1.length - 1;
		while (swap != 0)
		{
			swap = 0;
			for (int i = 0; i < length; i++)
			{
				if (list1[i].compareTo(list1[i + 1]) > 0)
				{
					swap(list1, i, i + 1);
					swap++;
				}
			}
			length--;
		}
	}
}
