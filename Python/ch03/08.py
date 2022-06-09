# 크루스칼 알고리즘

def find_parent(parent,x):
    if parent[x]!=x:
        parent[x]=find_parent(parent,parent[x])
    return parent[x]

def union_parent(parent,a,b):
    a=find_parent(parent,a)
    b=find_parent(parent,b)
    if a<b:
        parent[b]=a
    else:
        parent[a]=b

#number of node=v, number of line=e
v,e=map(int,input().split())
parent=[0]*(v+1)

edges=[]
result=0

for i in range(1,v+1):
    parent[i]=i

for _ in range(e):
    a,b,cost=map(int,input().split())
    edges.append((cost,a,b))

#간선을 비용 순으로 정렬
edges.sort()

for edge in edges:
    cost,a,b=edge
    #부모 노드가 같지 않다면 사이클이 발생하지 않음
    if find_parent(parent,a)!=find_parent(parent,b):
        union_parent(parent,a,b)
        result+=cost
print(result) #간선의 총 비용 출력