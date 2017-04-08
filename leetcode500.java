public class Solution {
    public String[] findWords(String[] words) {
		// faster way
		// use character in the same row to combinate a string and save it into a string array
		// use mape concept to set key-value pair(same row character will have the same key)
		String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<strs.length;i++){
			for(char c: strs[i].toCharArray()){
				map.put(c, i);
			}
		}

		int flag=0;
		int index=0;
		String nowTemp;
		List<String> res = new LinkedList<>();
		// find the row which first character in the string is in,
		// verify following character in the same row or not(use map get concept to get the key to verify)
		for(int i=0;i<words.length;i++){
			nowTemp=words[i];
			flag=0;
			index=map.get(words[i].toUpperCase().charAt(0));
			for(char c:words[i].toUpperCase().toCharArray()){
				if(map.get(c)!=index){
					flag=1;
					break;
				}
			}
			if(flag==0){
				res.add(nowTemp);
			}
		}
		// finally convert to string array
		return res.toArray(new String[0]);
		
		
		// naive way
		// use string indexOf function to verify character in the same row or not.
		// first set the flag for detecting character in the same row or not, the result list, and variable to temporary save the string
		// int sameRow=1;
		// List<String> result = new ArrayList<String>();
		// String target="";

		// set three char array for converting to string
		// char[] firstRow={'q','w','e','r','t','y','u','i','o','p'};
		// String sfirst=new String(firstRow);
		// char[] secondRow={'a','s','d','f','g','h','j','k','l'};
		// String ssecond=new String(secondRow);
		// char[] thirdRow={'z','x','c','v','b','n','m'};
		// String sthird=new String(thirdRow);
		// char a_char;
		// String tempS="";
		
		// loop parameter words(string array), first find the row which first character in,
		// then verify the following character in the same row or not
		// for(int i=0;i<words.length;i++){
		//     sameRow=1;
		//     tempS=words[i];
		//     a_char=Character.toLowerCase(tempS.charAt(0));
		//     if(sfirst.indexOf(a_char)!=-1)
		//         target=sfirst;
		//     else if(ssecond.indexOf(a_char)!=-1)
		//         target=ssecond;
		//     else
		//         target=sthird;
		//     for(int j=1;j<tempS.length();j++){
		//         a_char=tempS.charAt(j);
		//         if(target.indexOf(Character.toLowerCase(a_char))==-1&&target.indexOf(Character.toLowerCase(a_char))==-1){
		//             sameRow=0;
		//             continue;
		//         }
		//     }
		//     if(sameRow==1){
		//         result.add(tempS);
		//     }
		// }   
		
		// convert result list to string array and return
		// String[] stockArr = new String[result.size()];
		// stockArr=result.toArray(stockArr);
		// return stockArr;
    }
}
