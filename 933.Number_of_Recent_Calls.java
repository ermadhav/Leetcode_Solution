class RecentCounter {
    Queue<Integer> queue; // stores ping request times

    public RecentCounter() {
        queue = new LinkedList<>(); // initialize queue
    }

    public int ping(int t) {
        queue.add(t); // add current ping time
        
        // remove pings older than (t - 3000)
        while(!queue.isEmpty() && queue.peek() < t - 3000){
            queue.poll();
        }
        
        return queue.size(); // return number of recent pings
    }
}