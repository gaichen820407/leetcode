public class Solution {
    public int findComplement(int num) {
		//Use simple way to find complement
		//The core solution is use a mask(a binary number has all 1 bits,max length is parameter binary form's length)
		
		//1.Convert integer number to binary form & get the length of binary number
        String binaryNum=Integer.toBinaryString(num);
        int numLength=binaryNum.length();
		
		//2.Get the mask & convert it to int data type(XOR calculate)
        String XORtarget="";
        for(int i=0;i<numLength;i++){
            XORtarget+="1";
        }
        int XORvalue=Integer.parseInt(XORtarget, 2);
        int XORresult=(num^XORvalue);
        return XORresult;
		
		
		
		//
    }
}
