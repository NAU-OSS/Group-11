// Developed by Robel Tegegne, Melina Diamond-Sagias, Bradley Kukuk, and Abdulraham Alamoud
class mathFunction
{
	public static void main(String args[])
	{
		// Initializing Variables
	  char[] answer = new char [ 100 ];
	  int c1 = 1;
	  int n1 = 1;
	  int d1 = 1;
	  int c2 = 2;
	  int n2 = 2;
	  int d2 = 3;
    	char d3;

		// Checking if the function works successfully
	  if( add( c1, n1, d1, c2, n2, d2, answer, 100) )
	  {
		  //Print Statement
	    System.out.println("\nNice");
	  }
	  // if function fails, it will output the error message
    else
    {
      System.out.println("There is an error!");
    }
	}

	//Function Declaration for add()
	public static boolean add(int c1, int n1, int d1, int c2, int n2, int d2, char result[], int len)
	{
		// sets index for the function
	  int index = 0;
		// Checks if index is less than the len
	  if( index < len )
	  {
		result[0] = (char)c1;
		//Incrementing the index
		index++;
		// Checks if index is less than the len
	    if( index < len )
	    {
		  result[1] = (char)n1;
		  //Incrementing the index
		  index++;
		  // Checks if index is less than the len
	      if( index < len )
	      {
			result[2] = (char)d1;
			//Incrementing the index
			index++;
			// Checks if index is less than the len
	        if( index < len )
	        {
			  result[3] = (char)c2;
			  //Incrementing the index
			  index++;
			  // Checks if index is less than the len
	          if( index < len )
	          {
				result[4] = (char)n2;
				//Incrementing the index
				index++;
				// Checks if index is less than the len
	            if( index < len )
	            {
				  result[5] = (char)d2;
				  //Incrementing the index
				  index++;
				  // Checks if index is less than the len
                if( index < len )
                {
					// Adding final value to the array as specified in the documentaion for the function
                  result[6] = '\0';
                }
	            }
	          }
	        }
	      }
		}
		// Wanted return value
	    return true;
	  }
	  // Failing return value
	  return false;
	}
	//bool subtract(int c1, int n1, int d1, int c2, int n2, int d2, char result[], int len);

}
