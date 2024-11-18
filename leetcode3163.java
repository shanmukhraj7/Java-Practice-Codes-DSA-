class leetcode3163 {
    public static void main(String[] args) {
       String word =  "aaaaaaaaaaaaaabb";
       String comp= "";
       int count = 1;
       for(int i=0; i<word.length()-1; i++)
       {
            if(word.charAt(i) == word.charAt(i+1))
            {
                count++;
            }
            else
            {
                count = 1;
            }
       }
       for(int i = 0; i<word.length()-1; i++)
       {
         if(word.charAt(i) == word.charAt(i+1))
         {
             comp = comp + word.charAt(i);
         }
         else
         {
             comp = comp + word.charAt(i) + String.valueOf(count);
             count = 1;
         }
       }
       System.out.println(comp);
    }
}