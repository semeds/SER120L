public class Animal {
	private int age;
	private int wt;
	private int ht;

	public Animal(){
		this.age = 0;
		this.wt = 0;
		this.ht = 0;
	}

	public Animal(int age, int wt, int ht){
		this.age = age;
		this.wt = wt;
		this.ht = ht;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getWt(){
		return wt;
	}

	public void setWt(int wt){
		this.wt = wt;
	}

	public int getHt(){
		return ht;
	}

	public void setHt(int ht){
		this.ht = ht;
	}
}
