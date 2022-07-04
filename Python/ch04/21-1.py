# 다시 풀어보기
from collections import deque

n,m,v=map(int,input().split())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

visited=[0]*(n+1)

for i in range(len(graph)):
    graph[i].sort()

def dfs(v):
    visited[v]=1
    print(v,end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(i)

def bfs(v):
    visited[v]=1
    q=deque([v])
    while q:
        now=q.popleft()
        print(now,end=' ')
        for i in graph[now]:
            if not visited[i]:
                visited[i]=True
                q.append(i)

dfs(v)
visited=[0]*(n+1)
print()
bfs(v)