import heapq
import sys

input=sys.stdin.readline
INF=int(1e9)

# n=도시의 개수, m=통로의 개수, start=메시지를 보내는 도시
n,m,start=map(int,input().split())
graph=[[] for i in range(n+1)]
distance=[INF]*(n+1)

for _ in range(m):
    x,y,z=map(int,input().split())
    graph[x].append((y,z))

def dijkstra(start):
    q=[]
    heapq.heappush(q,(0,start))
    distance[start]=0
    while q:
        dist,now=heapq.heappop(q)
        if distance[now]<dist:
            continue
        for i in graph[now]:
            cost=dist+i[1]
            if cost<distance[i[0]]:
                distance[i[0]]=cost
                heapq.heappush(q,(cost,i[0]))

dijkstra(start)

count=0
max_dis=0

for i in distance:
    if i!=INF:
        count+=1
        max_dis=max(max_dis,i)
print(count-1,max_dis)