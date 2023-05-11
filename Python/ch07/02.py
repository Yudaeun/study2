from collections import deque

def bfs():
    q=deque()
    q.append([home[0],home[1]])
    while q:
        x,y=q.popleft()
        if abs(x-fes[0])+abs(y-fes[1])<=1000:
            print("happy")
            return
        for i in range(n):
            if not visited[i]:
                nx,ny=conv[i]
                if abs(x-nx)+abs(y-ny)<=1000:
                    q.append([nx,ny])
                    visited[i]=1


t=int(input())
for i in range(t):
    n=int(input())
    home=[int(x) for x in input().split()]
    conv=[]
    for j in range(n):
        x,y=map(int,input().split())
        conv.append([x,y])
    fes=[int(x) for x in input().split()]
    visited=[0 for i in range(n+1)]
    bfs()
