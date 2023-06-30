public class Q2_ArrangingCoins {
    public static int arrangeCoins(int n) {
        // initialize left(l) and right(r) pointer
        long l = 1, r = n;
        while(l<=r) {
            long mid = l + (r-l)/2; // calculate the mid number
            long mcoin = (mid*(mid+1)/2); // calculate the sum till mid
            if(mcoin == n) { // we have to check either sum till mid is equal to n or not
                return (int) mid;
            } else if(mcoin > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)r;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(5));
    }
}
