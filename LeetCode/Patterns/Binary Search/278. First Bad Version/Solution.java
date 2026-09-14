/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start = 1;
        int end = n;

        while(start < end) {
            int mid = start + (end - start) / 2;
        
            if(isBadVersion(mid)) {
                end = mid; //we know if mid is bad then elements after that are also so just eliminate them but we also have to check for the before elements
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}