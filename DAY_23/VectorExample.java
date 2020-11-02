import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1","내용1","작성자1"));
		list.add(new Board("제목2","내용2","작성자2"));
		list.add(new Board("제목3","내용3","작성자3"));
		list.add(new Board("제목4","내용4","작성자4"));
		list.add(new Board("제목5","내용5","작성자5"));
		
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		list.remove(2);
		list.remove(3);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
	}

}
