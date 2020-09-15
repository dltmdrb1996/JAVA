package sec07_example;

public class DaoExample {
	public void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoExample dao= new DaoExample();
		dao.dbwork(new OracleDao());
		dao.dbwork(new MySqlDao());
	}

}
