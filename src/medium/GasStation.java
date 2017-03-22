package medium;

public class GasStation {
	
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	if(gas == null || cost == null || gas.length == 0 || gas.length != cost.length)
    		return -1;
    	int tank = 0, total = 0, currentStart = 0;
    	for(int i = 0; i < gas.length; ++i){
    		tank += gas[i] - cost[i];
    		if(tank < 0){
    			total += tank;
    			tank = 0;
    			currentStart = i + 1;
    		}
    	}
    	total += tank;
    	return total >= 0 ? currentStart : -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = new int[]{1,2,3,3};
		int[] cost = new int[]{2,1,5,1};
		System.out.println(canCompleteCircuit(gas, cost));
	}

}
