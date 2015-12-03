public class Binary_Search {
	
	static int binarySearch(int[] array, int x){
		int l = 0;
		int r = array.length -1;
		int m = (r + l) /2;
		
		while(l<=r){
			m = (r + l) /2;
			if(array[m] == x){
				return m;
			}
			if(array[m] < x){
				l = m + 1;
			}
			if(array[m] > x){
				r = m +1;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,5,7,8,10,15};
		int x = 10;
		System.out.println(binarySearch(array, x));
	}
}