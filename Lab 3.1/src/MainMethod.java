
public class MainMethod 
{
	public static void main(String [] args)
	{
		int [] test1 = {1,5,3,8,2,5,4,10};
		ArrayMethods1.insertionSort(test1);
		for (int i = 0; i < test1.length; i++)
		{
			System.out.print(test1[i]);
		}
	}
}
