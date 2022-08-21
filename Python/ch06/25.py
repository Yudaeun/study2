#solve the tomato again

from collections import deque

m,n=map(int,input().split())

graph=[]

for _ in range(n):
    graph.append(list(map(int,input().split())))
# input the graph info

q=deque()

for i in range(n):
    for j in range(m):
        if graph[i][j]==1:
            q.append((i,j)) #input the tomato (x,y) at a q

dx=[-1,1,0,0]
dy=[0,0,-1,1]

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
                q.append((nx,ny))
                graph[nx][ny]=graph[x][y]+1

bfs()

graph=sum(graph,[])
if 0 in graph:
    print(-1)
else:
    print(max(graph)-1)