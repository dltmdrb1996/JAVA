	
public interface Storage<T> {
	public void add(T item, int index);
	// 매개변수의 구체적 타입을 정하지 않는다
	// 저장소에 저장될 객체에 의해서 나중에 구체적으로 지정
	
	public T get(int index);
	
	
}
