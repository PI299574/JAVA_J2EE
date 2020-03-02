package InterviewQuestion;

public class Person {

	
	int id;
	String name;
	int colorId;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getColorId() {
		return colorId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", colorId=" + colorId
				+ "]";
	}
	
	
}
