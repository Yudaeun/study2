
'''
1. 문자열로 입력 받는다.
2. 적록색맹이 아닐 때의 영역 개수와 그래프에서 R->G로 변경하고 영역 개수를 구한다.
3. DFS 사용
'''
n=int(input())
graph=[]
for _ in range(n):
    graph.append(list(map(str,input())))

count=0
count1=0
dx=[-1,1,0,0]
dy=[0,0,-1,1]
visited=[[0]*n for _ in range(n)]
def dfs(x,y,color):
    visited[x][y]=1
    for i in range(4):
        nx=x+dx[i]
        ny=y+dy[i]
        if nx<=-1 or nx>=n or ny<=-1 or ny>=n:
            continue
        if not visited[nx][ny]:
            if graph[nx][ny]==color:
                dfs(nx,ny,color)

for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            dfs(i,j,graph[i][j])
            count+=1
visited=[[0]*n for _ in range(n)]

for i in range(n):
    for j in range(n):
        if graph[i][j]=='G':
            graph[i][j]='R'

for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            dfs(i,j,graph[i][j])
            count1+=1
print(count,count1)