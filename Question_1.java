package Assign_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question_1 {

	public static void main(String[] args)
	{
		List<Float> li = new ArrayList<Float>();
		
		li.add((float) 1.5);
		li.add((float) 3.6);
		li.add((float) 1.567);
		li.add((float) 3.64);
		li.add((float) 12.5);
		
		float sum = 0;
		Iterator<Float> itr = li.iterator();
		while(itr.hasNext())
		{
			sum += itr.next();
		}
		System.out.println(sum);
	}
}
