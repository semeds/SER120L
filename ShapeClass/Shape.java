public class Shape { //create derived classes Triangle, CIRCLE, Rectangle
	private int ht;
	private int wd;

	//double argument constructor
	public Shape(int ht, int wd){
		this.ht = ht;
		this.wd = wd;
	}

	public int getWd() {
		return wd;
	}

	public void setWd(int wd) {
		this.wd = wd;
	}

	public int getHt() {
		return ht;
	}

	public void setHt(int ht) {
		this.ht = ht;
	}

	public double getArea(){
		//System.out.println("This getArea of Shape.");
		return 0;
	}

	public double getPerimeter(){
		//System.out.println("This is the getPerimeter of Shape.");
		return 0;
	}
}