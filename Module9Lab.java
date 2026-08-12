import java.io.*;
public class Module9Lab {
	public static void main(String[] args) {
		try (
				FileInputStream inputStream = new FileInputStream("D:/Notepad++/Java/userList.txt"); 
				FileOutputStream outputStream = new  FileOutputStream("D:/Notepad++/Java/userListCopy.txt");
        ) { 
		int data;
		while ((data = inputStream.read()) != -1) {
			outputStream.write(data);
		}
		System.out.println("Data copied from userList.txt to userListCopy.txt successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
		}
	}
}