package Q_5;

public class Anonymous {
	Vehicle field = new Vehicle(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("�����Ű� �޸��ϴ�");
		}	
	};
	
	void method1() {
		Vehicle localVar= new Vehicle() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�¿����� �޸��ϴ�");
			}	
		};
		localVar.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
}
