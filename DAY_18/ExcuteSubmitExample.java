import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteSubmitExample {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//스레드풀 객체인 excutorservice 객체를 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
					// executorService는 ThreadPoolExecutor 객체로부터 만들어졌음 -- 타입변환
					int poolSize = threadPoolExecutor.getPoolSize();
					// getPoolSize() : 현재 스레드 풀에 있는 스레드의 개수를 반환하는 메소드
					String threadName= Thread.currentThread().getName();
					System.out.println("[총 스레드 개수 : "+poolSize+" 작업쓰레드 이름 : "
							+ ""+threadName);		
					int value = Integer.parseInt("문자");
				}
			};
		executorService.execute(runnable);
		Thread.sleep(10);
		}
		//작업이 끝나고 난뒤~~ 스레드를 종료(작업큐의 작ㅇ버을 처리한후 스레드 풀을종료)
		executorService.shutdown();
	}	

}
