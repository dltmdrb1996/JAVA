import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Supplier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> supplier = ()->{
			String s = "asd";
			return s;
		};
		System.out.println(supplier.get());
		
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		System.out.println(intSupplier.getAsInt());
	}

}
