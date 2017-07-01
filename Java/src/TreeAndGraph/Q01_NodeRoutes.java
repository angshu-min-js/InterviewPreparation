package TreeAndGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

public class Q01_NodeRoutes {
	//States of node
	enum State { Univisited, Visited, Visiting;}
	
	// Node Implementation
	public static class node{
		String vertex;
		public String getVertex() {
			return this.vertex;
		}
		ArrayList<node> adjacent;
		node[] getAdjacent() {
			node[] adj = adjacent.toArray(new node[adjacent.size()]);
			return adj;
		}
		public void setAdjacent(node adj) {
			this.adjacent.add(adj);
		}
		public State state;
		node(){
			vertex = "";
			adjacent = new ArrayList<>();
		}
		node(String vertex){
			this.vertex = vertex;
			adjacent = new ArrayList<>();
		}
	}
	// Graph Implementation
	private static int size;
	private static node[] vertices;
	static int max;
	
	public Q01_NodeRoutes() {
		// TODO Auto-generated constructor stub
		size=0;
		max=20;
		vertices = new node[max];
	}
	public Q01_NodeRoutes(int input){
		this.size =0;
		max = input;
		vertices = new node[max];
	}
	
	int getSize(){
		return this.size;
	}
	
	node[] getVertices(){
		return vertices;
	}
	public void addVertex(node input) {
		if(size>=max){
			System.out.println("Graph Full, Baby");
			return;
		}
		vertices[size] = input;
		size++;
	}
	
	//Check connection
	
	public boolean isConnected(node start, node end){
		Queue<node> q = new LinkedList<node>();
		for(node n: this.getVertices())
		{ n.state = State.Univisited;}
		
		node temp;
		q.add(start);
		start.state = State.Visiting;
		while(!q.isEmpty()){
			temp = q.poll();
			if(temp!=null){
				for(node n: temp.getAdjacent()){
					if(n.state == State.Univisited){
						if(n==end){
							return true;
						}else{
							n.state = State.Visiting;
							q.add(n);
						}
					}
				}
				temp.state = State.Visited;
			}
			
		}
		
		
		return false;
	}
	public static void main(String args[]){
		node[] temp = new node[6];
		Q01_NodeRoutes g = new Q01_NodeRoutes(6);
		
		temp[0] = new node("a");
		temp[1] = new node("b");
		temp[2] = new node("c");
		temp[3] = new node("d");
		temp[4] = new node("e");
		temp[5] = new node("f");
		
		temp[0].setAdjacent(temp[1]);
		temp[0].setAdjacent(temp[2]);
		temp[0].setAdjacent(temp[3]);
		temp[2].setAdjacent(temp[5]);
		temp[3].setAdjacent(temp[4]);
		for(int i = 0 ; i < 6 ; i++){
			g.addVertex(temp[i]);
		}		
	
		System.out.println(g.isConnected(temp[0], temp[2]));
		System.out.println(g.isConnected(temp[3], temp[5]));

	}
}
