# 유기농배추 BFS 사용. 코드 참고

from collections import deque

t=int(input())
graph=[]
dx=[-1,1,0,0]
dy=[0,0,-1,1]

def bfs(x,y):
    q=deque()
    q.append((x,y))
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if nx<=-1 or nx>=m or ny<=-1 or ny>=n:
                 continue
            if graph[nx][ny]==0:
                 continue
            if graph[nx][ny]==1:
                graph[nx][ny]=0
                q.append((nx,ny))


for _ in range(t):
    m, n, k = map(int, input().split())  # k= 배추가 심어져 있는 위치의 개수
    count=0
    graph = [[0]*n for _ in range(m)] #처음에는 0으로 초기화
    for _ in range(k):
        x,y=map(int,input().split())
        graph[x][y]=1 #입력받은 곳은 배추가 심어져 있기 때문에 1로 변경
    for i in range(m):
        for j in range(n):
            if graph[i][j]==1:
                    bfs(i,j)
                    count+=1
    print(count)

