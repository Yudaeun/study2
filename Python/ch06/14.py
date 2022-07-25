n,m,x,y,k=map(int,input().split())
graph=[]
for _ in range(n):
    graph.append(list(map(int,input().split())))
move=list(map(int,input().split()))

dx=[0,0,-1,1]
dy=[1,-1,0,0]
d=[0]*6
def dice(v):
    if v==1:
        d[0],d[1],d[2],d[3],d[4],d[5]=d[3],d[1],d[0],d[5],d[4],d[2]
    elif v==2:
        d[0], d[1], d[2], d[3], d[4], d[5] = d[2],d[1],d[5],d[0],d[4],d[3]
    elif v==3:
        d[0], d[1], d[2], d[3], d[4], d[5] = d[4],d[0],d[2],d[3],d[5],d[1]
    else:
        d[0], d[1], d[2], d[3], d[4], d[5] = d[1],d[5],d[2],d[3],d[0],d[4]

nx=x
ny=y

for i in move:
    nx+=dx[i-1]
    ny+=dy[i-1]

    if nx<=-1 or nx>=n or ny<=-1 or ny>=m:
        continue
    dice(i)
    if graph[nx][ny]==0:
        graph[nx][ny]=d[-1]
    else:
        d[-1]=graph[nx][ny]
        graph[nx][ny]=0
    print(d[0])