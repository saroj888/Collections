package Assign_3;

import java.util.Scanner;
import java.util.Stack;

public class question_3 
{
		static Stack<Integer > st = new Stack<Integer>();
		static Integer minEle = Integer.MAX_VALUE;
		
		public static void pushEle(int num)
		{
			if(st.empty())
			{
				minEle = num;
				st.push(num);
				return;
			}
			if(num < minEle) {
				st.push(2*num - minEle);
				minEle = num;
			}
			else{
				st.push(num);
			}
		}
		
		public static int popEle() {
			if(st.empty())
			{
				System.out.println("Cant pop the Element");
				return -1;
			}
			int top = st.pop();
			if(top<minEle)
			{
				minEle = 2*minEle - top;
			}
			return top;
		}
		
		public static int getMin()
		{
			if(st.empty())
			{
				return -1;
			}
			return minEle;
		}
		
		public static void main(String[] args) 
		{
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : PUSH ELEMENTS");
		System.out.println("2 : POP ELEMENTS");
		System.out.println("3 : GET MIN ELEMENT");
		System.out.println("4 : EXIT");
		
		while(true)
		{
			int n = sc.nextInt();
			switch(n)		
			{
			case 1:
				System.out.println("Enter the Element:");
				int num = sc.nextInt();
				pushEle(num);
				break;
				
			case 2: 
			System.out.println("Poped element is :" + popEle());
				break;
				
			case 3:
				System.out.println("Minimum element is :" + getMin());
				break;
				
			default:
				System.out.println("INVALID CHOICE.");
			}
			
		}
		
	}
}
