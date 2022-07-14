package loginTest;

public class User {
	//String 타입의 id, pw, name --> private 변수
	private String name, pw, id;

	
	
	public User(String name, String pw, String id) {
		this.name = name;
		this.pw = pw;
		this.id = id;
	}
	
	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
 