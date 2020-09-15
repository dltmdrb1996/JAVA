package sec07_example;

public class DaoExample {
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		dbwork(new OracleDao());
		dbwork(new MySqlDao());
	}

}
