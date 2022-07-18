n,m=map(int,input().split())
graph=list(map(int,input().split()))

# 입력받은 숫자 그래프를 정렬하고, 백트래킹을 이용해서 중복되지 않는 수열을 출력
num=[]
visited=[0]*(n+1)
graph.sort()
def dfs(start):
    if len(num)==m:
        print(' '.join(map(str,num)))
    for i in range(start,len(graph)):
        if visited[i]==0:
            visited[i]=1
            num.append(graph[i])
            dfs(i)
            num.pop()
            visited[i]=0
dfs(0)