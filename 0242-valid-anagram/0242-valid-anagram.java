import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();

        HashMap<Character,Integer> count=new HashMap<>();
        HashMap<Character,Integer> count2=new HashMap<>();
        if(n1==n2)
        {
        for(int i=0;i<n1;i++){
            if(count.containsKey(s.charAt(i)))
            {
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
            else{
                count.put(s.charAt(i),1);
            }

        }
        for(int i=0;i<n1;i++){
            if(count2.containsKey(t.charAt(i)))
            {
                count2.put(t.charAt(i),count2.get(t.charAt(i))+1);
            }
            else{
                count2.put(t.charAt(i),1);
            }

        }
        if(count.equals(count2))
        {
            return true;
        }
        else{
            return false;
        }


        }
        else{
            return false;
        }


    }
}