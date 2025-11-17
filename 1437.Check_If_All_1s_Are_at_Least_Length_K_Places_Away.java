public boolean kLengthApart(int[] nums, int k) {

    int prev = -1; // stores previous index of 1

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {

            if (prev != -1) {
                // check distance between consecutive 1s
                int distance = i - prev - 1;

                // if distance is too small → fail
                if (distance < k) {
                    return false;
                }
            }

            prev = i; // update previous index
        }
    }

    return true; // all distances are valid
}
