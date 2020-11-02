package with_resources;

public class TryWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInput fis = new FileInput("file.txt")){
			fis.read();
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
