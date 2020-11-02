package DAY_25;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail","홍길동"));
		messageQueue.offer(new Message("SendSMS","고길동"));
		messageQueue.offer(new Message("SendSPAM","정길동"));
		messageQueue.offer(new Message("SendMONEY","이길동"));
		messageQueue.offer(new Message("SendGIFT","김길동"));
		
		while(!messageQueue.isEmpty()) {
			Message msg= messageQueue.poll();
			System.out.println(msg.command+"을 "+msg.to+"에게");
		}
	}	

}
