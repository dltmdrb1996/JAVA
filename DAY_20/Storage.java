	
public interface Storage<T> {
	public void add(T item, int index);
	// �Ű������� ��ü�� Ÿ���� ������ �ʴ´�
	// ����ҿ� ����� ��ü�� ���ؼ� ���߿� ��ü������ ����
	
	public T get(int index);
	
	
}
