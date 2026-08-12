import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class IOStreamExample {
	public static void main(String[] args) {
		// File node - reading and writing to files
		try (
				FileInputStream inputStream = new
				FileInputStream("D:/Notepad++/Java/input.txt");
				FileOutputStream outputStream = new
				FileOutputStream("D:/Notepad++/Java/output.txt"); 
		) {
		int data;
		// Reading data from the source (input stream)
		while ((data = inputStream.read()) != -1) {
			// Writing data to the sink (output stream)
			outputStream.write(data);
		}
		System.out.println("Data copied from input.txt to output.txt successfully.");
		} catch (IOException e) {
		e.printStackTrace();    
		}
	}
}