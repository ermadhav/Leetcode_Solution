class Solution {
	public void segregateElements(int[] arr) {

        // creating same size array 
		int[] temp = new int[arr.length];

        // k tells where to insert the element
		int k = 0;

        // firstly storing the +ves and 0s
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] >= 0) {
				temp[k] = arr[i];
				k++; // move k to next empty index
			}
		}

        // and then storing the -ves 
		for (int j = 0; j<arr.length; j++) {
			if (arr[j] < 0) {
				temp[k] = arr[j];
				k++;
			}
		}

        // again copying the same temp in to arr because quesion demands
		for(int i=0; i<arr.length; i++){
		    arr[i] = temp[i];
		}
	}
}
