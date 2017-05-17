package during;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pair> all = new ArrayList<Pair>();
		ArrayList<Pair> starters = getFirstOrLastDish(all);
		ArrayList<Pair> desserts = getFirstOrLastDish(all);
		ArrayList<Pair> main = all;
		ArrayList<ArrayList<Pair>> finished = match(starters, main, desserts);
		System.out.println(finished);
	}

	private static ArrayList<ArrayList<Pair>> match(ArrayList<Pair> starters, ArrayList<Pair> main,
			ArrayList<Pair> desserts) {
		
		return null;
	}

	public static ArrayList<Pair> getFirstOrLastDish(ArrayList<Pair> all){
		Random rand = new Random();
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		int third = all.size() / 3;
		ArrayList<Pair> norraF = getNorraF(all);
		for(int i = 0; i < third; i++){
			Pair selected = null;
			if(norraF.size() != 0){
				do{
					selected = norraF.get(rand.nextInt(norraF.size()));
				} while (selected.getSize() == 3);
				
				pairs.add(selected);
				all.remove(selected);
			} else {
				do{
					selected = all.get(rand.nextInt(all.size()));
				} while(selected.getArea() == 3);	
				pairs.add(selected);
				all.remove(selected);
			}
		}
		return pairs;
	}
	
	public static ArrayList<Pair> getNorraF(ArrayList<Pair> all){
		ArrayList<Pair> norraF = new ArrayList<Pair>();
		for(Pair p: all){
			if(p.getArea() == 1){
				norraF.add(p);
			}
		}
		return norraF;
	}

}
