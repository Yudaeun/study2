# 퇴사
# n만큼 루프 돌면서 ti를 저장해두는 리스트를 하나씩 체크해서
# n+1이 넘지 않는 선에서 pi가 가장 최대가 되는 값을 찾는다.
# 못 푼 문제 DP를 이용해서 풀어야 함
import itertools
from itertools import combinations
'''
#입력받기
n=int(input())
call=[]
day=[]
dic={}
for i in range(n):
    a,b=map(int,input().split())
    if (a > n - i):
        continue
    day.append(a)
    call.append(b)

print(call)

sets=[]
pay=[]
for i in range(1,n+1):
    sets.append(list(itertools.combinations(day,i)))
    pay.append(list(itertools.combinations(call,i)))

sets=sum(sets,[])
pay=sum(pay,[]) #1차원 리스트로 만들기
new_sets=[]
num=0
pay_num=[]
# 모든 조합을 확인하면서 날짜가 n보다 같거나 작으면 그 인덱스를 pay_num에 넣는다.
# 위에서 페이랑 날짜랑 같이 조합을 구했기 때문에, 조합의 인덱스는 같을 것이기 때문이다.
# 이를 이용해서 그 날짜의 인덱스만 pay에서 전부 확인하면서 sum 값이 가장 큰 것을 출력한다.
# 헐 근데 며칠날 잡혀있는 상담인지도 고려해야 하네

for i in sets:

    if sum(i)<=n:
        new_sets.append(list(i))
        pay_num.append(num)
    num+=1
result=0
for i in pay_num:
    result=max(result,sum(pay[i]))

print(result)
'''

n=int(input())
t,p=[0 for _ in range(n+1)],[0 for _ in range(n+1)]
dp=[0 for _ in range(n+1)]
for i in range(n):
    a,b=map(int,input().split())
    t[i]=a
    p[i]=b

for i in range(n-1,-1,-1):
    if t[i]+i<=n:
        dp[i]=max(dp[i+1],p[i]+dp[i+t[i]])
    else:
        dp[i]=dp[i+1]
print(dp[0])