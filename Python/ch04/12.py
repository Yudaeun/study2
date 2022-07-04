from collections import deque
#미로 탐색 BFS 사용

n,m=map(int,input().split())
graph=[]
for _ in range(n):
    graph.append(list(map(int,input())))

dx=[-1,1,0,0] # 상하좌우
dy=[0,0,-1,1]

def bfs(x,y):
    q=deque()
    q.append((x,y))
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if nx<=-1 or nx>=n or ny<=-1 or ny>=m:
                continue
            if graph[nx][ny]==0:
                continue
            if graph[nx][ny]==1:
                graph[nx][ny]=graph[x][y]+1 #최단 거리 위치를 기록
                q.append((nx,ny))
    return graph[n-1][m-1] #맵의 가장 오른쪽 아래까지의 거리 반환

print(bfs(0,0))