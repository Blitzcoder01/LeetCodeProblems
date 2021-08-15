class Solution {
    public int lengthOfLongestSubstring(String s) {
 HashMap<Character,Integer>hmap=new HashMap<Character,Integer>();
        int length=0,res=0;
        
        //iterating over the string
        for(int i=0;i<s.length();i++)
        {
            //if we find duplicate we begin again from next index of last occurance of repeating character
            if(hmap.containsKey(s.charAt(i)))
            {
                length=0;
                i=hmap.get(s.charAt(i))+1;//updates the i value for loop to go back in index
                hmap.clear();
            }
            hmap.put(s.charAt(i),i);
            length++;
            res=Math.max(res,length);//storing the max result
        }
        return res;
    }
}
