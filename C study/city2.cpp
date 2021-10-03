#include <bits/stdc++.h>
#define INF 1e9

using namespace std;

int n,m,start;
vector<pair<int,int> > graph[30001];
int d[30001];

void dijkstra(int start){
	priority_queue<pair<int,int> > pq;
	pq.push({0,start});
	d[start]=0;
	while(!pq.empty()){
		//가장 최단 거리가 짧은 노드에 대한 정보를 꺼냄 
		int dist=-pq.top().first; //현재 노드까지의 비용
		int now=pq.top().second; //현재 노드
		pq.pop();
		if(d[now]<dist) continue;
		//현재 노드와 연결된 다른 인접한 노드들을 확인한다.
		for(int i=0;i<graph[now].size();i++){
			int cost=dist+graph[now][i].second;
			if(cost<d[graph[now][i]].first){
				d[graph[now][i].first]=cost;
				pq.push(make_pair(-cost,graph[now][i].first));
			}
		} 
	}
}


int main(void){
	cin>>n>>m>>start;
	
	for(int i=0;i<m;i++){
		int x,y,z;
		cin>>x>>y>>z;
		graph[x].push_back({y,z});
	}
	fill(d,d+30001,INF);
	dijkstra(start);
	
	int count=0;
	int maxDistance=0;
	for(int i=1;i<=n;i++){
		if(d[i]!=INF){
			count+=1;
			maxDistance=max(maxDistance,d[i]);
		}
	}
	cout<<cout-1<<' '<<maxDistance<<'\n'; //시작 노드는 제외해야 하니까 count-1 출력 
}
