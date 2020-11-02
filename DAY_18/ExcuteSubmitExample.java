import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteSubmitExample {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//������Ǯ ��ü�� excutorservice ��ü�� ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					// executorService�� ThreadPoolExecutor ��ü�κ��� ��������� -- Ÿ�Ժ�ȯ
					int poolSize = threadPoolExecutor.getPoolSize();
					// getPoolSize() : ���� ������ Ǯ�� �ִ� �������� ������ ��ȯ�ϴ� �޼ҵ�
					String threadName= Thread.currentThread().getName();
					System.out.println("[�� ������ ���� : "+poolSize+" �۾������� �̸� : "
							+ ""+threadName);		
					int value = Integer.parseInt("����");
				}
			};
		executorService.execute(runnable);
		Thread.sleep(10);
		}
		//�۾��� ������ ����~~ �����带 ����(�۾�ť�� �ۤ����� ó������ ������ Ǯ������)
		executorService.shutdown();
	}	

}
