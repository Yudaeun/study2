# 로봇청소기
# 시뮬레이션
graph=[]
n,m=map(int,input().split())
r,c,d=map(int,input().split())
for _ in range(n):
    graph.append(list(map(int,input().split())))

dx=[-1,0,1,0]#  북동남서
dy=[0,1,0,-1]

visited=[[0]*m for _ in range(n)]

def turn_left():
    global d
    d-=1
    if d==-1:
        d=3

result=1 # 청소하는 칸의 개수
turn_cnt=0
visited[r][c]=1
while True:
    turn_left()
    nx=r+dx[d]
    ny=c+dy[d]
    if graph[nx][ny]==0 and visited[nx][ny]==0:

        result+=1
        visited[nx][ny] = 1
        r=nx
        c=ny
        turn_cnt=0
        continue
    else:
        turn_cnt+=1
    if turn_cnt==4:
        nx=r-dx[d]
        ny=c-dy[d] # 네 방향 다 확인했다면 후진
        if graph[nx][ny]==0: # 이동할 수 있으면
            r=nx
            c=ny
        else:
            break
        turn_cnt=0

print(result)