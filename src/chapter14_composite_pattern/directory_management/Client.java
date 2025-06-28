package src.chapter14_composite_pattern.directory_management;

public class Client {

	public static void main(String[] args) {
		final Directory dir1 = new Directory("root");
		final Directory dir2 = new Directory("Dir1");

		final File f1 = new File(100, "f1");
		final File f2 = new File(100, "f2");
		final File f3 = new File(100, "f3");
		final File f4 = new File(100, "f4");

		dir1.addEntry(f1);
		dir1.addEntry(dir2);
		dir2.addEntry(f2);
		dir2.addEntry(f3);
		dir2.addEntry(f4);

		dir1.print();
	}
}
