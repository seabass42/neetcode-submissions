class StockSpanner {

    private Stack<Integer> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        if (stack.isEmpty()){
            stack.push(1);
            stack.push(price);
            return 1;
        }
        while (!stack.isEmpty() && stack.peek() <= price){
            stack.pop();
            span += stack.pop();
        }
        stack.push(span);
        stack.push(price);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */