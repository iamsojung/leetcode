/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1) return 1;        
        
        int begin = 1;
        int end = n;
        int mid = (end - begin) / 2 + begin;
        
        while(true){
            if(isBadVersion(mid)){
                
                if(!isBadVersion(mid-1)){
                    return mid;
                } else {
                    end = mid-1;
                    mid = (end-begin) / 2 + begin;
                }
                
            } else {
                
                begin = mid+1;
                mid = (end-begin) / 2 + begin;
                
            }
        }
    }
}