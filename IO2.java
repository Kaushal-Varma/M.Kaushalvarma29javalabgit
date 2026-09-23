import java.io.*;

class IO2 {
	public static void main(String[] a) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("data.txt");
		fos.write("Hello Java".getBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream("data.txt");
		int ch;
		
		while ((ch = fis.read()) != -1) {
			System.out.println((char)ch);
		}
			
		fis.close();
	}
}