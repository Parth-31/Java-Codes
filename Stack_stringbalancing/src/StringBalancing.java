import java.util.*;
class StringBalancing{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         Stack<Character> stax = new Stack<>();
         for(int i = 0; i < input.length(); i++){
             if(!stax.isEmpty()){
                 switch(input.charAt(i)){
                     case '}' :
                     if(stax.peek()=='{'){
                         stax.pop();
                     }
                     break;

                     case ')' :
                     if(stax.peek()=='('){
                         stax.pop();
                     }
                     break;
                     
                     case ']' :
                     if(stax.peek()=='['){
                         stax.pop();
                     }
                     break;
                     default:
                     stax.push(input.charAt(i));
                   }
                }
             
             else{
                 stax.push(input.charAt(i));
             }
         }
          System.out.println(stax.isEmpty());
      }
      
   }
}

