/**
 * 
 */
package com.diru.sample;

/**
 * @author User
 *
 */
public class TestSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleA obj1 = new SampleA("Java");
		SampleB obj2 = new SampleB();
		
		System.out.println("About to print");
		System.out.println(obj1);
		System.out.println(obj2);
		
		String strObjName = new String(obj1.toString());
		System.out.println("strObjName: " + strObjName);

		SampleA obj3 = new SampleA("Java");
		System.out.println(obj3);

		SampleA obj4 = new SampleA("C++");

		
		if(obj1.equals(obj3)){
			System.out.println("1 == 3");
		}
		
		else{
			System.out.println("1 != 3");
		}
		

		if(obj1.equals(obj4)){
			System.out.println("1 == 4");
		}
		
		else{
			System.out.println("1 != 4");
		}
		
		
		if(strObjName.equals("SampleA")){
			System.out.println("This is Sample A");
		}
		
		else{
			System.out.println("This is not Sample A");
		}

	}

}
