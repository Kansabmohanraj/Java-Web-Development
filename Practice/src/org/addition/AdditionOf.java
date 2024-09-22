package org.addition;

public class AdditionOf {
	//TC=O(1)
	//SC=O(1)
	public void addTwoNum(int x,int y,int count) {
		
		count=x+y;//O(1)
		System.out.println(count);//O(1)
		
	}
	
	//TC=O(x)
	//SC=O(1)
	public void printallNum(int x) {
		
		for(int i=0;i<=x;i++) {
		System.out.println(i);
		}
	}
	
	public void multipleOfTwo(int x) {
		
		for(int i=0;i<=x;i=i+2) {
		//int count=i%2;
		System.out.println(i);
		
		}
		AdditionOf a = new AdditionOf();
		a.multipleOfTwo(x/2);
	}
	public void countDigits(int x ,int count) {
		int i=x;
		while(i>0) {
			i=i/10;
			count=count+1;
		}
	
		System.out.println(count);
	
		
	}
	public static void main(String[] args) {
		AdditionOf a = new AdditionOf();
		a.addTwoNum(2, 3, 0);
		//a.printallNum(10);
		//a.multipleOfTwo(20);
		a.countDigits(786, 0);
		
	}

}
