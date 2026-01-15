class Solution {
    public boolean lemonadeChange(int[] bills) {

        int countFive = 0; // number of $5 bills
        int countTen = 0;  // number of $10 bills

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                // customer pays with $5, no change needed
                countFive++;

            } else if (bills[i] == 10) {
                // need to give back $5 as change
                if (countFive == 0) return false;
                countFive--;
                countTen++;

            } else if (bills[i] == 20) {
                // need to give back $15 as change
                if (countTen > 0 && countFive > 0) {
                    // give $10 + $5
                    countTen--;
                    countFive--;
                } else if (countFive >= 3) {
                    // give three $5 bills
                    countFive -= 3;
                } else {
                    // cannot give change
                    return false;
                }
            }
        }

        // change given to all customers
        return true;
    }
}
