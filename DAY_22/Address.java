
public class Address {
	private String City;
	private String Country;
	
	public Address(String country, String city) {
		this.Country = country;
		this.City = city;
		
	}

	public String getCity() {
		return City;
	}

	public String getCountry() {
		return Country;
	}
}
