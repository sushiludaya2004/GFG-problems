import java.util.*;

public class GFG {

    private static int recLen(String str, int index) {
        if (index == str.length())
            return 0;
        else
            return recLen(str, index + 1) + 1;
    }
  
    private static int recLen(String str) 
  	{
  		if (str.equals(""))
  			return 0;
  		else
  			return recLen(str.substring(1)) + 1;
  	}

    public static void main(String[] args) {
        String str = "InputOutput";
        System.out.println(recLen(str, 0));
    }
}
