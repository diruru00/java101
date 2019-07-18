package com.diru.sample;

public class My_Class{
		public static void main(String args[]){
			//Instantiating  the outer class
			
			Outer_Class outer = new Outer_Class();
			
			//Accessing the display_Inner() method
			
			outer.display_Inner();
			
			//Accessing the print in local method
			
			
			Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
			inner.print();
		}
		
}