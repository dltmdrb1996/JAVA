package DAY_25;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail","ȫ�浿"));
		messageQueue.offer(new Message("SendSMS","��浿"));
		messageQueue.offer(new Message("SendSPAM","���浿"));
		messageQueue.offer(new Message("SendMONEY","�̱浿"));
		messageQueue.offer(new Message("SendGIFT","��浿"));
		
		while(!messageQueue.isEmpty()) {
			Message msg= messageQueue.poll();
			System.out.println(msg.command+"�� "+msg.to+"����");
		}
	}	

}
