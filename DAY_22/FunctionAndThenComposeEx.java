import java.util.function.Function;

public class FunctionAndThenComposeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Member2, Address> functionA;
		Function<Address, String> functionB;
		Function<Member2, String> functionAB;
		String city;
		String city2;
		functionA = (m)->m.getAddress();
		functionB = (a)->a.getCity();
		functionAB = functionA.andThen(functionB);
		city=functionAB.apply(new Member2("홍길동","hong", new Address("대하민국","성남")));
		System.out.println("거주 도시 : "+city);
		
		functionAB = functionB.compose(functionA);
		city=functionAB.apply(new Member2("홍길동","hong", new Address("대하민국","성남")));
		System.out.println("거주 도시 : "+city);
	}

}
