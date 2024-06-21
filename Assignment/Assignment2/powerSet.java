class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
       List<String> a= new ArrayList<>();
       int subsets= 1<<(s.length());
       for (int i=0;i<subsets;i++){
           String ans="";
           for (int j=0;j<s.length();j++){
               if ((i &(1<<j))!=0)
               ans=ans+s.charAt(j);
           }
           if (!ans.isEmpty())
           a.add(ans);
       }
       Collections.sort(a);
        // Code here
        return a;
    }
}
