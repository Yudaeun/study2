import sys
n,m=map(int,sys.stdin.readline().split())

# 백트래킹으로 수열을 구한다. 수열의 길이가 m이 되면 수열을 출력하고, 반환해서 다시 백트래킹한다.
# 루프문을 이용해 1부터 n까지 반복하며 백트래킹한다. 같은 수를 골라도 되기 때문에 방문 리스트는 필요없다.
# 스타트 지점을 지정하면, 그 전(?)의 수를 방문하지 않으니까... 스타트 지점을..지정한다...
num=[]
def dfs(start):
    if len(num)==m:
            print(' '.join(map(str,num)))
            return
    for i in range(start,n+1):
        num.append(i)
        dfs(i)
        num.pop()
dfs(1)