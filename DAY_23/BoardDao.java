import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardDao {
	
	ArrayList<Board> getBoardList(){
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board("力格1","郴侩1","积己磊1"));
		list.add(new Board("力格2","郴侩2","积己磊2"));
		list.add(new Board("力格3","郴侩3","积己磊3"));
		return list;
		
		
	}
}
