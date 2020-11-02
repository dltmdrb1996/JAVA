package with_resources;

public class FileInput implements AutoCloseable{
	private String file;
	
	public FileInput(String file) {
		this.file=file;
	}
	public void read() {
		System.out.println("파일을 읽습니다.");
	}
	@Override
	public void close() throws Exception{
		System.out.println("파일을 닫습니다");
	}
}
