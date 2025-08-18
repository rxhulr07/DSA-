
public class Ispalindrome{

boolean IsPalindrome(String s, int start, int end) {

    if (start >= end) return true;

  
    if (!Character.isLetterOrDigit(s.charAt(start))) {
        return IsPalindrome(s, start + 1, end);
    }


    if (!Character.isLetterOrDigit(s.charAt(end))) {
        return IsPalindrome(s, start, end - 1);
    }


    if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
        return false;
    }

    return IsPalindrome(s, start + 1, end - 1);
}


public static void main(String[] args) {
String s = "A man, a plan, a canal: Panama";
Ispalindrome obj = new Ispalindrome();

System.out.println(obj.IsPalindrome(s, 0 , s.length()-1));
   
  }

}
