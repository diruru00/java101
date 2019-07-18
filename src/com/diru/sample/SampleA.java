/**
 * 
 */
package com.diru.sample;

/**
 * @author User
 *
 */
public class SampleA {
	
	String myName = "";
	public SampleA (String myName) {
		this.myName = myName;
	}
	@Overrides
	public String toString(){
		return "myName";
	}
	
	@Override
	public boolean equals(Object obj){
		boolean isEqual = false;
	if(obj instanceof SampleA) {
		String objName = ((SampleA) obj).toString();
		if(objName.equals(myName)){
			isEqual = true;
		}
	}
	return isEqual;
	}
}
