package mapInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Properties;

public class MapPractice {
	public static void main(String[] args) throws IOException {
Properties prop = new Properties();

FileInputStream fis = new FileInputStream("C:\\Users\\abhis\\OneDrive\\Desktop\\visionClass\\WholePractices\\src\\mapInterface\\abcd.properties");
prop.load(fis);
System.out.println(prop.getProperty("browser"));

		
	}
}

