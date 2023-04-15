
public class InvalidAgeException extends Exception 
{
	//If you want to give custom message
	public InvalidAgeException ()
	{  
        super("Age cannot be in negative.");  
    }
}
