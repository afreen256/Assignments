package labassign4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question1 {

	public static void main(String[] args) {

		FileInputStream f = null;
		try {
			 f = new FileInputStream("data.txt");

			int line = 0;
			
			while((line = f.read()) != -1) {
				System.out.print((char)line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

