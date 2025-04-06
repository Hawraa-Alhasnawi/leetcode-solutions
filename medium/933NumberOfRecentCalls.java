import java.util.LinkedList;
import java.util.Queue;
// 933. Number of Recent Calls
class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek()< t-3000){
            queue.poll();
        }
        return queue.size();
    }
}
