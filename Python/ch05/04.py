import copy

n=int(input())
m=copy.deepcopy(n)
result=0
while n>=0:
    if n%5==0:
        result+=(n//5)
        print(result)
        break
    n-=3
    result+=1
else:
    print(-1)

dp=[-1]*5001
dp[3]=dp[5]=1

n=copy.deepcopy(m)

for i in range(6,n+1):
    if i%5==0:
        dp[i]=dp[i-5]+1
    elif i%3==0:
        dp[i]=dp[i-3]+1
    elif dp[i-3]>0 and dp[i-5]>0:
        dp[i]=min(dp[i-3],dp[i-5])+1
print(dp[n])