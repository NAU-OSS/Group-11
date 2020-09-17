class mathFunction
{
	public static void main(String args[])
	{
	  char[] answer = new char [ 100 ];
	  int c1 = 1;
	  int n1 = 1;
	  int d1 = 1;
	  int c2 = 2;
	  int n2 = 2;
	  int d2 = 3;
    char d3;

	  if( add( c1, n1, d1, c2, n2, d2, answer, 100) )
	  {
	    System.out.println(4.16666666);
	  }
    else
    {
      System.out.println("There is an error!");
    }
	}

	public static boolean add(int c1, int n1, int d1, int c2, int n2, int d2, char result[], int len)
	{
	  int index = 0;
	  if( index < len )
	  {
	    result[0] = (char)c1;
	    index++;
	    if( index < len )
	    {
	      result[1] = (char)n1;
	      index++;
	      if( index < len )
	      {
	        result[2] = (char)d1;
	        index++;
	        if( index < len )
	        {
	          result[3] = (char)c2;
	          index++;
	          if( index < len )
	          {
	            result[4] = (char)n2;
	            index++;
	            if( index < len )
	            {
	              result[5] = (char)d2;
	              index++;
                if( index < len )
                {
                  result[6] = '\0';
                }
	            }
	          }
	        }
	      }
	    }
	    return true;
	  }
	// Failing return value
	  return false;
	}
	//bool subtract(int c1, int n1, int d1, int c2, int n2, int d2, char result[], int len);

}
