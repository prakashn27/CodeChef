import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    class Ladder implements Comparable<Ladder> {
        Integer from, to, jump;
        public Ladder(Integer from, Integer to) {
            this.from = from;
            this.to = to;
            this.jump = to - jump
        }
        
        public int compareTo(Ladder that) {
            return that.jump.compareTo(this.jump); // decending order
        }
        
        public String toString() {
            return from + "->" + to + "(" + jump + ")";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int ladder = sc.nextInt();
            PriorityQueue<Ladder> pq = new PrioirtyQueue<Ladder>();
            while(ladder-- > 0) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                pq.add(new Ladder(from, to));
            }
            
        }
        
    }
}