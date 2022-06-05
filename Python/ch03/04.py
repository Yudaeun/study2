INF=int(1e9)

n,m=map(int,input().split())
graph=[[INF]*(n+1) for _ in range(n+1)]

#자기자신->자기자신으로 가는 길
for a in range(1,n+1):
    for b in range(1,n+1):
        if a==b:
            graph[a][b]=0

#간선 정보 받고, A와 B가 서로에게 가는 길을 1이라고 설정
for _ in range(m):
    a,b=map(int,input().split())
    graph[a][b]=1
    graph[b][a]=1

print("거쳐갈 노드와 최종노드")
pass_node,final_node=map(int,input().split())

#플로이드 워셜
for k in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            graph[a][b]=min(graph[a][b],graph[a][k]+graph[k][b])

distance=graph[1][pass_node]+graph[pass_node][final_node]

if distance>=INF:
    print("-1")
else:
    print(distance)