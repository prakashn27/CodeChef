import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Node implements Comparable<Node> {
    public Integer val;
    public Integer cost;
    public Node(int val, int cost) {
        this.val = val;
        this.cost = cost;
    }
    public int compareTo(Node x) {
        return this.cost.compareTo(x.cost);
    }
    
    public String toString() {
        return this.val + "(" + this.cost + ")";
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            //System.out.println(t + " - " + n + " " + m);
            ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>(n + 1);
            for(int i = 0; i <= n + 1; i++) {
                adj.add(new ArrayList<Node>());
            }
            while(m-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                adj.get(a).add(new Node(b, c));
                adj.get(b).add(new Node(a, c));
            }
            Integer[] dist = new Integer[n + 1];
            Arrays.fill(dist, Integer.MAX_VALUE);
            //System.out.println(adj);
            int s = sc.nextInt();
            dist[s] = 0;
            LinkedList<Node> q = new LinkedList<Node>();
            q.add(new Node(s, 0));
            while(!q.isEmpty()) {
                Node cur = q.remove();
                ArrayList<Node> l = adj.get(cur.val);
                for(Node temp : l) {
                    if(dist[temp.val] > temp.cost + dist[cur.val]) {
                        // add to q and update dist
                        dist[temp.val] = temp.cost + dist[cur.val];
                        q.add(temp);
                    }
                }
            }
            for(int i = 1; i < n + 1; i++) {
                if(i != s) {
                    System.out.print((dist[i]==Integer.MAX_VALUE) ?"-1 " :dist[i] + " ");
                }
            }
            System.out.println();
            
        }
    }
}