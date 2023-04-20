public class Cat extends Animal {
	private String markings;
	private String meow;

	public Cat(){
		super();
		this.markings = " ";
		this.meow = " ";
	}

	public Cat(String markings, String meow){
		super();  //call super in every derived class's constructor
		this.markings = markings;
		this.meow = meow;
	}

	public Cat(String markings, String meow, int ht, int wt, int age){
		super(age, wt, ht); // need initialize parent class data first, so it needs to be on the first line
							// super is used because we need to access the parent class data (its private as well)
		this.markings = markings;
		this.meow = meow;
	}

	public String getMarkings(){
		return markings;
	}

	public void setMarkings(String markings){
		this.markings = markings;
	}

	public string getMeow(){
		return meow;
	}

	public void setMeow(String meow){
		this.meow = meow;
	}

	@Override
	public String move(){
		return "prowl";
	}

	public String toString(){
		return "Animal [age= " + age + ", wt=" + wt + ", ht= " + ht"]";
	}
}
