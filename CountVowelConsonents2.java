class CountVowelConsonents2
{
   public static void main(String args[])
      {
        int Vcount=0,Ccount=0;
        String str="saveetha school of Engineering";
        String Vowels=" ";
        String Consonents=" ";
        char ch;
        str=str.toLowerCase();
        int n=str.length();
        for(int i=0;i<2;i++)
        {
          ch=str.charAt(i);
          if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
         {
          Vowels +=ch+ " ";
          Vcount++;
          }
          else if(ch>='a'&&ch<='z')
          {
           Consonents +=ch+ " ";
           Ccount++;
          }
           System.out.println("length is:" + n);
           System.out.println("number of Vowels:" + Vcount);
           System.out.println("Vowels:"+ Vowels);
           System.out.println("number of Consonants:"+ Ccount);
           System.out.println("Consonents:"+ Consonents);
        }
     }
}