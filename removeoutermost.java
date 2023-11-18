import java.lang.*;
public class removeoutermost {
  public static void main(String[] args) {
    String s = "(()())(())";
    System.out.println(removeOuterParentheses(s));
  }
  public static String removeOuterParentheses(String s) 
    {
      StringBuilder str= new StringBuilder();
      int count=0;
        for (char c1 : s.toCharArray())// Code block to be executed for each character (c1) in the string
        {
            if(c1=='(')
            {
              if(count>0){
              str.append(c1);
              }
              count++;
            }
            else if(c1==')')
            {
              count--;
              if(count>0){
              str.append(c1);
            }
          }
            
            }
            return str.toString();
}
}
