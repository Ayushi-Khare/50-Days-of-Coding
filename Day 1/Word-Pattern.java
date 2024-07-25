/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" "); 
        if(arr.length!=pattern.length())
        {
            return false;
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(pattern.charAt(i)==pattern.charAt(j))
                {
                    if (arr[i].equals(arr[j])==false)
                    {
                        return false;
                    }
                }
                else
                {
                    if(arr[i].equals(arr[j])==true)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
