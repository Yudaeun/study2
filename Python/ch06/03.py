from collections import deque
n=int(input())
m=int(input())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
visited=[0]*(n+1)
cnt=0

def bfs(v):
    global cnt
    visited[v]=1
    q=deque()
    q.append(v)
    while q:
        v=q.popleft()
        for i in graph[v]:
            if visited[i]==0:
                visited[i]=1
                q.append(i)
                cnt+=1

bfs(1)
print(cnt)