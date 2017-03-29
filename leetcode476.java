public class Solution {
	public int hammingDistance(int x, int y) {
		int XORresult=x^y;
		int count=0;
		
		//Use Brian Kernighan’s algorithm(http://marswork.logdown.com/posts/282831-algorithm-brian-kernighans-bit-count-algorithm)
		//To filter less significant bit 1
		while(XORresult>0){
			XORresult&=XORresult-1;
			count++;
		}
		return count;


		// naive way
		// Just find the length of both integers, and compare every bit in their binary forms
		// int mainLength=0;
		// int difference=0;
		// int result=0;
		// String iBinary=Integer.toBinaryString(x);
		// String jBinary=Integer.toBinaryString(y);
		// difference=Math.abs(iBinary.length()-jBinary.length());

		// if(iBinary.length()>jBinary.length()){
			//     mainLength=iBinary.length();
			//     for(int icomplement=0;icomplement<difference;icomplement++){
			//         jBinary='0'+jBinary;
			//     }
		// }
		// else{
		//     mainLength=jBinary.length();
		//     for(int icomplement=0;icomplement<difference;icomplement++){
		//         iBinary='0'+iBinary;
		//     }
		// }

		// char ic;
		// char jc;
		// for(int index=0;index<mainLength;index++){
		//     ic=iBinary.charAt(index);
		//     jc=jBinary.charAt(index);
		//     if(ic!=jc){
		//         result++;
		//     }
		// }
		// return result;
	}
}
