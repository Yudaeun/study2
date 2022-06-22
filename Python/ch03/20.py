# 위상 정렬
from collections import deque

# 노드의 개수, 간선의 개수
v,e=map(int,input().split())
indegree=[0]*(v+1)
graph=[[] for i in range(v+1)]

#간선 정보
for _ in range(e):
   a,b=map(int,input().split())
   graph[a].append(b)
   indegree[b]+=1

# 위상 정렬
def topology_sort():
    result=[]
    q=deque()
    for i in range(1,v+1):
        #처음 시작할 때 진입차수가 0인 노드를 큐에 삽입
        if indegree[i]==0:
            q.append(i)
    while q:
        # 큐가 빌 때까지 해당 원소와 연결된 노드들의 진입차수를 1씩 뺀다.
        now=q.popleft()
        result.append(now)
        for i in graph[now]:
            indegree[i]-=1
            if indegree[i]==0:
                q.append(i) #새롭게 진입차수가 0이 되는 노드를 삽입
    for i in result:
        print(i,end=' ')

topology_sort()