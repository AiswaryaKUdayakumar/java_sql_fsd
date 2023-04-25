package ustbatchno3.testNG;

public class Company {
	public String city;
	public int pricewithmaterial;
	public int pricewithoutmaterial;
	
	public Company(String city, int pricewithmaterial, int pricewithoutmaterial) {
		super();
		this.city = city;
		this.pricewithmaterial = pricewithmaterial;
		this.pricewithoutmaterial = pricewithoutmaterial;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPricewithmaterial() {
		return pricewithmaterial;
	}

	public void setPricewithmaterial(int pricewithmaterial) {
		this.pricewithmaterial = pricewithmaterial;
	}

	public int getPricewithoutmaterial() {
		return pricewithoutmaterial;
	}

	public void setPricewithoutmaterial(int pricewithoutmaterial) {
		this.pricewithoutmaterial = pricewithoutmaterial;
	}
	
}
