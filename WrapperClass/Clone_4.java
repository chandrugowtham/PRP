
public class Clone_4 implements Cloneable {

	private String name;

	public Clone_4(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Clone_4 clone() {
		try {
			return (Clone_4)super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("Cloning not allowed");
			return this;
		}
	}
	public static void main(String args[]) {
		Clone_4 c=new Clone_4("Abishek");
		Clone_4 clone_c=c.clone();
		clone_c.setName("Deepak");
		System.out.println(c.getName());
		System.out.println(clone_c.getName());
	}
	
}
