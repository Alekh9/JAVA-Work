import java.util.ArrayList;

public class ContainerWithMostWaterAL {
	public static int storeWaterBruteForce(ArrayList<Integer> height) {
		int maxWater =0;
		for (int i=0; i <height.size(); i++) {
			for (int j=i+1; j<height.size(); j++) {
				int hts = Math.min(height.get(i), height.get(j));
				int wdh = j-i;
				int currWater = hts*wdh;
				maxWater= Math.max(maxWater,currWater);
			}
		}
		return maxWater;
	}
				// 2 pointer approach ------ OPTIMISED METHOD
	public static int storeWater2PointerApproach(ArrayList<Integer> height) {
		int maxWater =0;
		int leftPointer=0;
		int rightPointer=height.size()-1;
		while (leftPointer<rightPointer){
			// Calculate Water Area
			int hts = Math.min(height.get(leftPointer), height.get(rightPointer));
			int wdh = rightPointer-leftPointer;
			int currWater = hts*wdh;
			maxWater= Math.max(maxWater,currWater);
			// Update pointer
			if (height.get(leftPointer)<height.get(rightPointer)) {
				leftPointer++;
			} else {
				rightPointer--;
			}
		}
		return maxWater;
	}

	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		System.out.println("Brute Force Method - Maximum Stored Water area is " + storeWaterBruteForce(height) + " Units.");
		System.out.println();
		System.out.println("2 Pointer Approach - Maximum Stored Water area is " + storeWater2PointerApproach(height) + " Units.");
	}
}
