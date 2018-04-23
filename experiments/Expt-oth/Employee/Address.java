package Employee;

public class Address {
	public String house_no;
	public String street;
	public String area;
	
	public Address(String house_no,String street,String area){
		this.house_no=house_no;
		this.street=street;
		this.area=area;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
    public String toString(){
    	return String.format("%s \n %s \n %s",house_no,street,area);
    }
	
}
