import java.io.*;

class fileio1 {
	public static void main(String[] args) throws IOException {
		String file_name = args[0];
		FileInputStream fis = new FileInputStream(file_name);
		int size = fis.available();
		byte b[] = new byte[size];
		fis.read(b);
		String data = new String(b);
		System.out.println(data);
		fis.close();
	}
}
	