package text;

public class Text {
	    private String text;

	    public Text(String text) {
	        this.text = text;
	    }

	    public String getText() {
	        return text;
	    }

	    public void setText(String text) {
	        this.text = text;
	    }
	    
	    
	    public void countWord()
	    {
	        int count=0;
	      for (int i=0;i<text.length();i++)
	      {
	        if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
	            count++;
	      }
	      System.out.println("No. of words present in the given text is:"+(count+1));
	    }
	    public void stringSearch(String subString)
	    {
	        int index=text.indexOf(subString);
	        if(index==-1)
	            System.out.println(subString+" not present in "+text);
	        else
	            System.out.println(subString+" found at "+(index+1));
	    }
	    
	    public void checkPalindrome()
	    {
	        String rev="";
	        for(int i=text.length()-1;i>=0;i--)
	        {
	          rev=rev+text.charAt(i);
	        }
	          if(text.equals(rev))
	          System.out.println("Given string is Palindrome");
	          else
	              System.out.println("Given string is not Palindrome");
	        }
	    
	    
	}

