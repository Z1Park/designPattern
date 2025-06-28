package src.chapter14_composite_pattern.directory_management;

public class File implements DirectoryPath {

	private String name;
	private int size;
	private int depth = 0;

	public File(final int size, final String name) {
		this.size = size;
		this.name = name;
	}

	public void setDepth(final int depth) {
		this.depth = depth;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void print() {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println("[File] %s, Size: %d".formatted(name, size));
	}
}
