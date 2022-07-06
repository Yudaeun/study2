import copy
import sys

sys.setrecursionlimit(1000000)
n=int(input())
graph=[]
for _ in range(n):
    graph.append(list(map(int,input().split())))

dx=[-1,1,0,0]
dy=[0,0,-1,1]
# reverse think
# 안전영역을 dfs 돌리면서 찾는다.
def dfs(x,y,num):
    graph[x][y]=0
    for i in range(4):
        nx=dx[i]+x
        ny=dy[i]+y
        if nx<=-1 or nx>=n or ny<=-1 or ny>=n:
            continue
        if graph[nx][ny]>num:
            graph[nx][ny]=0
            dfs(nx,ny,num)

max_num=0
for i in graph:
    max_num=max(max_num,max(i))
answer=0
graph_copy=copy.deepcopy(graph)
ect=list(set(sum(graph,[])))
if len(ect)<=1:
    if ect[0]==1 or ect[0]==100:
        print(0)
        exit()

for k in range(1,max_num+1 ):
    count = 0
    graph = copy.deepcopy(graph_copy)
    for i in range(n):

        for j in range(n):
            if graph[i][j]>k:
                dfs(i,j,k)
                count+=1

    answer=max(answer,count)

print(answer)