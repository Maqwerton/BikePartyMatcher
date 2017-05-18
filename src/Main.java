
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		String filename = "deltagare.txt";
		ArrayList<Pair> all = parser(filename);
		ArrayList<Pair> main = all;
		ArrayList<Pair> starters = getFirstOrLastDish(all);
		ArrayList<Pair> desserts = getFirstOrLastDish(all);
		for(int i = 0; i <= 3; i++){
            ArrayList<ArrayList<Pair>> finished = match(starters, main, desserts);
            System.out.println(finished);
        }
		//System.out.println(all.size());
		//for (int i = 0; i < all.size(); i++) {
		//	System.out.print(main.get(i).print());
		//}
		//System.out.println(finished);
	}

	private static ArrayList<ArrayList<Pair>> match(ArrayList<Pair> starters, ArrayList<Pair> main,
													ArrayList<Pair> desserts) {
		Random rand = new Random();
		ArrayList<ArrayList<Pair>> matches = new ArrayList<ArrayList<Pair>>();
		while(starters.size() != 0){
		    int select = rand.nextInt(starters.size());
            ArrayList<Pair> current = new ArrayList<Pair>();
            current.add(starters.get(select));
            current.add(main.get(select));
		    current.add(desserts.get(select));
		    starters.remove(select);
		    main.remove(select);
		    desserts.remove(select);
		    matches.add(current);
        }
		return matches;
	}

	public static ArrayList<Pair> getFirstOrLastDish(ArrayList<Pair> all) {
		Random rand = new Random();
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		int third = all.size() / 3;
		ArrayList<Pair> norraF = getNorraF(all);
		for (int i = 0; i < third; i++) {
			Pair selected = new Pair(2, 6932857,3586,56283);
			if (norraF.size() != 0) {
				do {
					selected = norraF.get(rand.nextInt(norraF.size()));
				} while (selected.getSize() == 3);

				pairs.add(selected);
				all.remove(selected);
			} else {
				do {
					selected = all.get(rand.nextInt(all.size()));
				} while (selected.getArea() == 3);
				pairs.add(selected);
				all.remove(selected);
			}
		}
		return pairs;
	}

	public static ArrayList<Pair> getNorraF(ArrayList<Pair> all) {
		ArrayList<Pair> norraF = new ArrayList<Pair>();
		for (Pair p : all) {
			if (p.getArea() == Area.norraF) {
				norraF.add(p);
			}
		}
		return norraF;
	}

	public static ArrayList<Pair> parser(String filename) throws IOException {
		ArrayList<Pair> all = new ArrayList<Pair>();
		BufferedReader br = null;
		FileReader fr = null;

		fr = new FileReader(filename);
		br = new BufferedReader(fr);

		String currentLine = br.readLine();
		String[] parts = currentLine.split(",");

		int group = 0;
		int id;
		int area;
		int size;

		while ((currentLine = br.readLine()) != null) {
				parts = currentLine.split(",");
				group = Integer.parseInt(parts[0]);
				id = Integer.parseInt(parts[1]);
				area = Integer.parseInt(parts[2]);
				size = Integer.parseInt(parts[3]);
				all.add(new Pair(size, id, group, area));
		}
		return all;
	}
}

