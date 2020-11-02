import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Consumer<String> consumer = (t) -> System.out.println(t+"8");
		consumer.accept("sdfsd");
		
		BiConsumer<String, String> biconsumer=(t, u)->{
			System.out.println(t+u);
		};
		biconsumer.accept("¿À´Ã", "³»ÀÏ");
		
		DoubleConsumer doubleconsumer = (t) -> System.out.println(t);
		doubleconsumer.accept(6.324234);
		
		ObjIntConsumer<String> objintconsumer =(t,i)->System.out.println(t+i);
		objintconsumer.accept("java",8);
		
	}

}
