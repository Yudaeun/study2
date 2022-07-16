n,m=map(int,input().split())

# 수열은 백트래킹으로 구한다. n까지 루프문 반복하면서
# 수열의 길이가 m이 되면 출력하고 반환한다. 그리고 수열에서 숫자 하나를 뺀다. 그러면 다음을 탐색한다.
# 같은 수르 골라도 되기 때문에 방문 리스트는 필요 없다.
num=[]
def dfs():
    if len(num)==m:
        print(' '.join(map(str,num)))
        return
    for i in range(1,n+1):
        num.append(i)
        dfs()
        num.pop()
dfs()