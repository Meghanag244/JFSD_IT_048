public class RepeatingChar {
    public static void main(String[] args) {
        String str = "aditya";
        char c=' ';
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = i + 1; j < str.length(); j++)
             {
                if (chars[i] != chars[j]) {
                     i++;
                }
                else    
                {
                     c = chars[i];

                }

        }
        
    }
    System.out.println("The first non repeating character is: " +c );
    }

}

