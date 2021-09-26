INF=int(1e9)

# 노드의 개수랑 간선의 개수를 입력받는다
n=int(input())
m=int(input())
# 2차원 리스트를 만들고 모든 값을 무한으로 초기화한다.
graph=[[INF]*(n+1) for _ in range(n+1)]

# 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화한다.
for a in range(1,n+1):
    for b in range(1,n+1):
        if a==b:
            graph[a][b]=0

for _ in range(m):
    # A에서 B로 가는 비용은 c라고 설정한다.
    a,b,c=map(int,input().split())
    graph[a][b]=c

# 점화식에 따라 플로이드 워셜 알고리즘을 수행한다.
for k in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            graph[a][b]=min(graph[a][b],graph[a][k]+graph[k][b])
            #시간 복잡도 O(N^3)

for a in range(1,n+1):
    for b in range(1,n+1):
        if graph[a][b]==INF:
            print("INF",end=" ")

        else:
            print(graph[a][b],end=" ")

    print()

