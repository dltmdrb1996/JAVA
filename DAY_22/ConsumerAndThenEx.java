import java.util.function.Consumer;

public class ConsumerAndThenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Member2> consumerA = (m)->{
			System.out.println("ConsumerA : "+m.getClass());
		};
		
		Consumer<Member2> consumerB = (m)->{
			System.out.println("consumerB : "+ m.getId());
		};
		Consumer<Member2> consumerAB = consumerA.andThen(consumerB);
		
		consumerAB.accept(new Member2("È«±æµ¿","hong", new Address("´ëÇÑ¹Î±¹","¼­¿ï")));
		
	}

}
