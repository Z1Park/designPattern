package src.chapter14_composite_pattern.directory_management;

import java.util.ArrayList;
import java.util.List;

public class Directory implements DirectoryPath {

	private String name;
	private int depth = 0;
	private List<DirectoryPath> entries = new ArrayList<>();

	public Directory(final String name) {
		this.name = name;
	}

	public void addEntry(final DirectoryPath entry) {
		entries.add(entry);
		entry.setDepth(depth + 1);
	}

	public void removeEntry(final Object entry) {
		entries.remove(entry);
	}

	public void setDepth(final int depth) {
		this.depth = depth;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		int size = 0;
		for (final DirectoryPath entry : entries) {
			size += entry.getSize();
		}
		return size;
	}

	public void print() {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println("[Directory] %s, Size: %d".formatted(name, getSize()));

		for (final DirectoryPath entry : entries) {
			entry.print();
		}
	}
}
