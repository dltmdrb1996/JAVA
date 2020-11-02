
public class ChildClass<T, M, C> extends Product<T, M>{
	
	private C company;
	public C getCompany() {
		return company;
	}
	
	void setCompany(C company) {
		this.company=company;
	}
	
}
