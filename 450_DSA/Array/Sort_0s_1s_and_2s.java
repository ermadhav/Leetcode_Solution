void sort012(int arr[], int n) {
	for (int i = 0; i<n; i++) {
		for (int j = 0; j<n - 1; j++) {

			// left element bigger , swap kar
			if (arr[j] > arr[j + 1]) {

				// swapping 
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}