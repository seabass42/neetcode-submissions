class StockSpanner {
    ArrayList<Integer> prices;
    public StockSpanner() {
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        prices.add(price);
        int i = prices.size() - 1;
        boolean spanEnd = false;
        int span = 0;
        while (i >= 0 && !spanEnd){
            if (prices.get(i) <= price){
                span++;
                i--;
            } else {
                spanEnd = true;
            }
        }
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */