package practice_java;

interface Readable {
	void read();
}

interface Writable{
	void write();
}

interface Storable{
	void store();
}

class file implements Readable,Writable,Storable{

	@Override
	public void store() {
		System.out.println("store the file");
	}

	@Override
	public void write() {
		System.out.println("write the file");
	}

	@Override
	public void read() {
		System.out.println("read the file");		
	}
	
}
public class Mainclass {

	public static void main(String[] args) {
		
		file f1 = new file();
		
		f1.read();
		f1.write();
		f1.store();
		}
	}
