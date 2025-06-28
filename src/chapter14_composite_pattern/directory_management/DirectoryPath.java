package src.chapter14_composite_pattern.directory_management;

public interface DirectoryPath {

	void setDepth(final int depth);

	String getName();

	int getSize();

	void print();
}
