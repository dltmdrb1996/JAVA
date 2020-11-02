import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1","����1","�ۼ���1"));
		list.add(new Board("����2","����2","�ۼ���2"));
		list.add(new Board("����3","����3","�ۼ���3"));
		list.add(new Board("����4","����4","�ۼ���4"));
		list.add(new Board("����5","����5","�ۼ���5"));
		
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
