public class Solution {
    public int findComplement(int num) {
	//The core solution is use a mask(a binary number has all 1 bits,max length is parameter binary form's length)
        //Find the number which binary form is all 1 bits, then do the XOR to find result
        int shiftInput=Integer.highestOneBit(num)<<1;		//Find the biggest bit in input and left shift 1
        shiftInput--;						//minus 1 then the number will become all 1 bits in binary form
        return (num^shiftInput); 		
		
	
	//naive way
	//Use simple way to find complement		
	//1.Convert integer number to binary form & get the length of binary number
        //String binaryNum=Integer.toBinaryString(num);
        //int numLength=binaryNum.length();
		
	//2.Get the mask & convert it to int data type(XOR calculate)
        //String XORtarget="";
        //for(int i=0;i<numLength;i++){
        //    XORtarget+="1";
        //}
        //int XORvalue=Integer.parseInt(XORtarget, 2);
        //int XORresult=(num^XORvalue);
        //return XORresult;
    }
}
