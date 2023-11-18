import java.util.HashMap;

public class isomorphic
{
  public static void main(String[]args) 
    {
      String s="paper";
      String t="title";
      System.out.println(isisomorphic(s,t));
    }
    public static boolean isisomorphic(String s, String t)
    {
      HashMap<Character,Character>map=new HashMap<>();
      if(s.length()!=t.length())
      {
        return false;
      }
      for(int i=0;i<s.length();i++)
      {
        char o=s.charAt(i);
        char r=t.charAt(i);
        if(!map.containsKey(o))
        {
          if(!map.containsValue(r))
          {
            map.put(o, r);
          }
          else{
            return false;
          }
        }
        else
        {
          char mapch= map.get(o);
          if(mapch!=r)
          {
            return false;
          }
        }
      }
        return true;
    }
}