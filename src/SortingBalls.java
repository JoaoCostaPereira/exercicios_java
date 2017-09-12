import java.util.ArrayList;

public class SortingBalls {
	
	public static ArrayList<Integer> sortRack(ArrayList<Integer> rack) {
		
		for(int i = 0; i < rack.size(); i++)
		{
			for(int j = i + 1; j < rack.size(); j++)
			{
				if(rack.get(i) > rack.get(j)) {
					int temp = rack.get(j);
					rack.set(j, rack.get(i));
					rack.set(i, temp);
				}
			}
		}
		
		return rack;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> rack = new ArrayList<Integer>();
		
		rack.add(20);
		rack = sortRack(rack);
		rack.add(10);
		rack = sortRack(rack);
		rack.add(30);
		rack = sortRack(rack);
		
		for (int i: rack) {
			System.out.println(i);
		}
	}

}