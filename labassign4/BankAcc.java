package labassign4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankAcc {
		public static void main(String[] args) {
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tester3.ser"));
				Employ employee = new Employ("Afreen", 51894873, "Nellore", 2400);
				oos.writeObject(employee);
				employee.display();
				System.out.println("data successfully serialized..!");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			ObjectInputStream objins;
			try {
				objins = new ObjectInputStream(new FileInputStream("tester3.ser"));
				Employ employeeObj = (Employ) objins.readObject();
				employeeObj.display();
				System.out.println("deserialized data successfully....!");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
