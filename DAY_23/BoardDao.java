import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardDao {
	
	ArrayList<Board> getBoardList(){
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board("����1","����1","������1"));
		list.add(new Board("����2","����2","������2"));
		list.add(new Board("����3","����3","������3"));
		return list;
		
		
	}
}
