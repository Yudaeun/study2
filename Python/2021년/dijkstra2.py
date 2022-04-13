import sys
import heapq
input=sys.stdin.readline
INF=int(1e9)

n,m=map(int,input().split())
start=int(input())
graph=[[] for i in range(n+1)]
visited=[False]*(n+1)
distance=[INF]*(n+1) # 최단거리 테이블을 모두 무한으로 초기화

for _ in range(m):
    a,b,c=map(int,input().split())
    graph[a].append((b,c)) # a번 노드에서 b번 노드로 가는 비용이 c이다

def dijkstra(start):
    q=[]
    # 시작 노드로 가기 위한 최단 경로는 0으로 설정해서 큐에 삽입한다
    heapq.heappush(q,(0,start))
    distance[start]=0
    while q: # 큐가 비어있지 않다면
        # 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
        dist,now=heapq.heappop(q)
        if distance[now]<dist: # 현재 노드가 이미 처리된 적이 있는 노드라면 무시한다.
            continue
        # 현재 노드와 연결된 다른 인접한 노드들을 확인한다.
        for i in graph[now]:
            cost=dist+i[i]
            # 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧으면
            if cost<distance[i[0]]:
                distance[i[0]]=cost
                heapq.heappush(q,(cost,i[0]))

dijkstra(start)

for i in range(1,n+1):
    if distance[i]==INF:
        print("거리 정보 없음")
    else:
        print(distance[i])