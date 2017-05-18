import java.util.ArrayList;

public class Pair {
	private int id;
	private int area;
	private int group;
	private int size;
	
	public Pair(int size, int id,  int group, int area){
		this.id = id;
		this.area = area;
		this.group = group;
		this.size = size;
	}
	
	public int getId(){
		return id;
	}
	
	public int getArea(){
		return area;
	}
	
	public int getGroup(){
		return group;
	}
	
	public int getSize(){
		return size;
	}

	//public String toString() {
		//return ("size: " + size + " Id: " + id + " Group: " + group + " Area: " + area);
	//}

	public String toString() {
		return (id + " " + group + " " + area);
	}

}
