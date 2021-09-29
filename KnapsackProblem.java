import java.util.Arrays;
import java.util.Comparator;
class Sack{
	
	public static double getMaxValue(int[] wt, int[] val, int capacity){
		ItemValue[] iVal=new ItemValue[wt.length];
		for(int i=0; i<wt.length; i++){
			iVal[i]=new ItemValue(wt[i],val[i],i);
		}
		Arrays.sort(iVal, new Comparator<ItemValue>() {
			public int compare(ItemValue o1, ItemValue o2){
				return o2.cost.compareTo(o1.cost);
			}
		});
		double totalValue=0d;
		for(ItemValue i: iVal){
			int curwt=(int)i.wt;
			int curVal=(int)i.val;
			if(capacity-curwt>=0){
				capacity=capacity-curwt;
				totalValue+=curVal;
			}
			else{
				double fraction=((double)capacity/(double)curwt);
				totalValue+=(curVal*fraction);
				capacity=(int)(capacity-(curwt * fraction));
				break;
			}
		}
		return totalValue;
	}
	static class ItemValue{
		Double cost;
		double wt,val,ind;
		public ItemValue(int wt,int val, int ind){
			this.wt=wt;
			this.val=val;
			this.ind=ind;
			cost=new Double((double)val/(double)wt);
		}
	}
	
}

public class KnapsackProblem {

	public static void main(String[] args) {
		Sack ob=new Sack();
		int[] wt={10,20,30,32,40};
		int[] val={12,13,11,34,46};
		int capacity=50;
		double max=ob.getMaxValue(wt,val,capacity);
		System.out.println("Maximum Value obtain by knapsack is: "+ max);
	}

}
