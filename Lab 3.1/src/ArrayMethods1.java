
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
		int count = 0;
		int num = 0;
		while (sortedintChecker(list1) == false)
		{
			int min = list1[num];
			int storei = 0;
			for (int i = 0; i < list1.length; i++)
			{
				if (list1[i] < min)
				{
					min = list1[i];
					storei = i;
				}
			}
			swapint(list1, count, storei);
			num++;
			count++;
		}
		/*int pos = 0;
		int posi = 0;
		for (int i = 0; i < list1.length; i++) 
		{
			list1[i];
		}*/
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
		while (sortedstringChecker(list1) == false)
		{
			int a = list1.length - 1;
			for (int i = 0; i < a; i++)
			{
				if (list1[i + 1].compareTo(list1[i]) < 0)
				{
					swapstring(list1, i, i + 1);
				}
			}
			a--;
		}
	}
	
	public static boolean sortedintChecker(int[] list1)
	{
		int sum = 0;
		for (int i = 0; i < list1.length - 1; i++)
		{
			if (list1[i] <= list1[i + 1])
			{
				sum++;
			}
		}
		if (sum == list1.length - 1)
		{
			return true;
		}
		return false;
	}
	
	public static boolean sorteddoubleChecker(double[] list1)
	{
		int sum = 0;
		for (int i = 0; i < list1.length - 1; i++)
		{
			if (list1[i] < list1[i + 1])
			{
				sum++;
			}
		}
		if (sum == list1.length - 1)
		{
			return true;
		}
		return false;
	}
	
	public static boolean sortedstringChecker(String[] list1)
	{
		int sum = 0;
		for (int i = 0; i < list1.length - 1; i++)
		{
			if (list1[i].compareTo(list1[i + 1]) < 0)
			{
				sum++;
			}
		}
		if (sum == list1.length - 1)
		{
			return true;
		}
		return false;
	}
}
