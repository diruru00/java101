package com.diru.sample;

class Outer_Class{
	int num;

	//private inner class
	private class Inner_Class{
		public void print(){
		System.out.println("This is an inner class");

		}
	}
	
	public class Inner_Class2 {
		public void print(){
				System.out.println("This is an inner class2");
		}
	}

	void myMethod(){
		//local member inner class
		class Inner_Class3 {
			public void print(){
				System.out.print("This is an inner class3 inside MyMethod");
			}
		}
	}
	//Accessing the inner class from the method within 
	void display_Inner(){
		Inner_Class inner = new Inner_Class();
		inner.print();

	}
}
