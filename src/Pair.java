package during;

public class Pair {
	private int id;
	private int area;
	private int group;
	private int size;
	
	public Pair(int id, int area, int group, int size){
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

}
