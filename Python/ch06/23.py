
n=int(input())
graph=[]
for _ in range(n):
    graph.append(int(input()))

d=[0]*n
d[0]=graph[0]
d[1]=graph[1]+graph[0]
d[2]=max(graph[0]+graph[2],graph[1]+graph[2])

for i in range(3,n):
    d[i]=max(graph[i]+graph[i-1]+d[i-3],graph[i]+d[i-2])

print(d)