#토마토

from collections import deque

dx=[-1,1,0,0]
dy=[0,0,-1,1]
q=deque()

def bfs():
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if nx<=-1 or nx>=n or ny<=-1 or ny>=m:
                continue
            if graph[nx][ny]==-1:
                continue
            if graph[nx][ny]==0:
                graph[nx][ny]=graph[x][y]+1
                q.append((nx,ny))


m,n=map(int,input().split())
graph=[]
for _ in range(n):
    graph.append(list(map(int,input().split())))

count=0
for i in range(n):
    for j in range(m):
        if graph[i][j]==1:
            q.append((i,j))

bfs()

graph=sum(graph,[])
if 0 in graph:
    print(-1)
else:
    print(max(graph)-1)