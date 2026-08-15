class Solution {
	public void segregateElements(int[] arr) {
		int[] temp = new int[arr.length];
		int k = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] >= 0) {
				temp[k] = arr[i];
				k++;
			}
		}
		for (int j = 0; j<arr.length; j++) {
			if (arr[j] < 0) {
				temp[k] = arr[j];
				k++;
			}
		}
		for(int i=0; i<arr.length; i++){
		    arr[i] = temp[i];
		}
	}
}
