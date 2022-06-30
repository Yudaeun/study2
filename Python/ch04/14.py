# 연결 요소의 개수
# 방향 없는 그래프->BFS 사용

from collections import deque
import time

n,m=map(int,input().split())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

visited=[0]*(n+1)

def bfs(v):
    q=deque([v])
    visited[v]=1
    while q:
        now=q.popleft()
        for i in graph[now]:
            if not visited[i]:
                visited[i]=1
                q.append(i)

count=0
for i in range(1,n+1):
    if visited[i]==0:
        bfs(i)
        count+=1

print(count)