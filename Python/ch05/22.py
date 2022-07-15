# 수열은 백트래킹 이용해서 구한다.
# 만약 수열 리스트의 수가 m개가 되면 수열을 모아두는 리스트에 수열을 저장하고
# 함수를 중단하고, 수열에서 숫자 하나를 뺀 다음 계속 백트래킹 한다.
# 수열 리스트 수가 아직 m개가 아니라면 루프 돌면서 계속 백트래킹

n,m=map(int,input().split())
visited=[0]*(n+1)
num=[]
answer=[]
cnt=1
def dfs(start):
    if len(num)==m:
        print(' '.join(map(str,num)))
        return
    for i in range(start,n+1):
            if visited[i]==0:
                visited[i]=1
                num.append(i)
                dfs(i+1)
                num.pop()
                visited[i]=0


dfs(1)
