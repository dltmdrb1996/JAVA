package with_resources;

public class FileInput implements AutoCloseable{
	private String file;
	
	public FileInput(String file) {
		this.file=file;
	}
	public void read() {
		System.out.println("������ �н��ϴ�.");
	}
	@Override
	public void close() throws Exception{
		System.out.println("������ �ݽ��ϴ�");
	}
}
