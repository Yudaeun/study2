n=int(input())
root=[0]*(n+1)
graph=[[0] for _ in range(n+1)]

def dfs(start,graph,root):
    for i in graph[start]:
        if root[i]==0:
            root[i]=start
            dfs(i,graph,root)

for _ in range(n-1):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

dfs(1,graph,root)
for i in range(2,n+1):
    print(root[i])