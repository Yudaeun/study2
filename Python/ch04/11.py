# DFS와 BFS
from collections import deque

n,m,v=map(int,input().split())
graph=[[] for _ in range(n+1)]

for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
visited=[False]*(n+1)

for i in range(len(graph)):
    graph[i].sort()

def dfs(graph,v,visited):
    visited[v]=True
    print(v,end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)

def bfs(graph,v,visited):
    queue=deque([v])
    visited[v]=True
    while queue:
        temp=queue.popleft()
        print(temp,end=' ')
        for i in graph[temp]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True
dfs(graph,v,visited)
visited=[False]*(n+1)
print()
bfs(graph,v,visited)
