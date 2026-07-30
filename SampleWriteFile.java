package Chapter9;
import java.io.FileWriter;
import java.io.IOException;
public class SampleWriteFile {

	public static void main(String[] args) {
		try {
			 FileWriter file=new FileWriter("myfile.text");
			 file.write("Next we are going to see about how to append.");
			 file.close();
			 System.out.println("File written successfully!");
		}catch(IOException e) {
			System.out.println("An error occured.");
					}
	}
}