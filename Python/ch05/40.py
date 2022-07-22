# dp 이용해서... 3배수와 5배수 자리에 1씩 더해준다 그리고 더 적은 값을 넣는다
# 설탕 배달
n=int(input())

dp=[-1]*(5001)
dp[3]=1
dp[5]=1
for i in range(6,n+1):
    if i%5==0:
        dp[i]=dp[i-5]+1
    if i%3==0:
        dp[i]=dp[i-3]+1
    if dp[i-3]>=0 and dp[i-5]>=0:
        dp[i]=min(dp[i-3],dp[i-5])+1

print(dp[n])