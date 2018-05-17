import java.util.Arrays;

import org.openqa.selenium.WebDriver;

public class MergeArrays {

	public static void main(String args[])
	{
		
		int a[] = {10,4,11,45,1};
		int b[] = {2,5,1,6,8};
		int temp[] = new int[a.length+b.length];
		int i=0, j=0, k=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(i < a.length && j < b.length)
		{
			if(a[i]>b[j])
				temp[k++] = b[j++];
			else
				temp[k++] = a[i++];
					
		}
		while (i < a.length)
	    {
	        temp[k] = a[i];
	        i++;
	        k++;
	    }
		 while (j < b.length)
		    {
		        temp[k] = b[j];
		        j++;
		        k++;
		    }
		for(int s : temp)
			System.out.println(""+s);
	}
}
