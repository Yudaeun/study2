import java.util.*;

class Node implements Comparable<Node>{
	private int index;
	private int distance;

	public Node(int index,int distance){
		this.index=index;
		this.distance=distance;
		}

	public int getIndex(){
		return this.index;
	}
	public int getDistance(){
		return  this.distance;
	}

	@Override
	public int compareTo(Node other){
		if(this.distance<other.distance){
			return -1;
		}
		return 1;
		}
	}

public class Main{
	public static final int INF=(int)1e9;
	public static int n,m,start;
	public static ArrayList<ArrayList<Node>> graph=new ArrayList<ArrayList<Node>>();
	public static int[] d=new int[100001];

	public static void dijkstra(int start){
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.offer(new Node(start,0));
		d[start]=0;
		while(!pq.isEmpty()){
			Node node=pq.poll();
			int dist=node.getDistance();
			int now=node.getIndex();
			if(d[now]<dis) continue;
			for(int i=0;i<graph.get(now).size();i++){
				int cost=d[now]+graph.get(now).get(i).getIndex()])