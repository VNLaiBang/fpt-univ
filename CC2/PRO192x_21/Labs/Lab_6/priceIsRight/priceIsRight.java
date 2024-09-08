public class priceIsRight {
    public static int priceIsRight(int[] bids, int price) {
        int bid = -1;
        
        for(int i = 0; i < bids.length; i++) {
            if(price - bids[i] >= 0 && bids[i] > bid)
                bid = bids[i];
        }
        
        return bid;
    }

    public static void main(String[] args) {
        int[] bids = {900, 885, 989, 1000, 850};
        int price = 850;
        System.out.println(priceIsRight(bids, price));
    }
}
