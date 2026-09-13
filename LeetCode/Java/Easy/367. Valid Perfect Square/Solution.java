class Solution {
    public boolean isPerfectSquare(int num) {
        
        int start = 0;
        int end = num;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if(square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1; // mid is small move right
            } else {
                end = mid - 1; // mid is big move left
            }
        }
        return false;
    }
}