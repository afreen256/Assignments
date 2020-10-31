package labassign4;
import java.io.IOException;
public class Test {
	public static void main(String[] args) 
	{
		Exception exception = new Exception();
		try {
			exception.throwException();
		} 
		catch (InputException e)
		{
		
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}


