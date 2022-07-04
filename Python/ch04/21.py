from collections import deque

n,m,v=map(int,input().split())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
    print(graph)
    #   인접 리스트 방식

visited=[False]*(n+1) #방문 리스트를 노드갯수만큼 초기화
for i in range(len(graph)):
    graph[i].sort()

def dfs(graph,v,visited):
    visited[v]=True #처음 시작하는 노드 방문 처리
    print(v,end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited) #dfs는 스택(재귀) 방식으로 동작

def bfs(graph,v,visited):
    visited[v]=True #처음 시작하는 노드 방문 처리
    q=deque([v])
    while q:
        now=q.popleft()
        print(now,end=' ')
        for i in graph[now]:
            if not visited[i]:
                visited[i]=True
                q.append(i)

dfs(graph,v,visited)
visited=[False]*(n+1)
print()
bfs(graph,v,visited)