package 第1章.clone;

public class Exam implements Cloneable{
	private String name;

	public Exam clone() {
		Exam result = new Exam();
		result.name = this.name;
		return result;
	}

	public Exam() {
	}

	public Exam(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
