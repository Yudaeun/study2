# 테트로미노는 4개짜리고 수들이 적힌 맵 위에 놓아야 한다.
# 못풀었음
n,m=map(int,input().split())
t=[]
for _ in range(n):
    t.append(list(map(int,input().split())))
visited=[[0]*m for _ in range(n)]
dx=[-1,1,0,0]
dy=[0,0,-1,1]
answer=0
max_val=max(map(max,t)) # 맵에서 가장 큰 값

def dfs(x,y,idx,total):
    global answer
    if answer>=total+max_val*(3-idx):
        return
    if idx==3:
        answer=max(answer,total)
        return
    else:
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<m and visited[nx][ny]==0:
                if idx==1:
                    #ㅗ모양 테트로미노를 기존 위치에서 돌리면서 확인
                    visited[nx][ny]=1
                    dfs(x,y,idx+1,total+t[nx][ny])
                    visited[nx][ny]=0
                visited[nx][ny]=1
                dfs(nx,ny,idx+1,total+t[nx][ny])
                visited[nx][ny]=0

for i in range(n):
    for j in range(m):
        visited[i][j]=1
        dfs(i,j,0,t[i][j])
        visited[i][j]=0

print(answer)