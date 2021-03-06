# 정수 X를 입력받는다.
x=int(input())

# 앞서 계산된 결과를 저장하기 위해서 DP 테이블을 초기화한다.
d=[0]*30001

# 다이나믹 프로그래밍을 진행한다.(보텀업)

for i in range(2, x+1):
    # 현재의 수에서 1을 뺀다.
    d[i]=d[i-1]+1
    # 현재의 수가 2로 나누어 떨어지는 경우
    if i%2==0:
        d[i]=min(d[i],d[i//2]+1)
    if i%3==0:
        d[i]=min(d[i],d[i//3]+1)
    if i%5==0:
        d[i]=min(d[i],d[i//5]+1)

print(d[x])