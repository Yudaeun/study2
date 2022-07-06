#MVP 다이아몬드(Easy)
#입력 받기
n=int(input())
s,g,p,d=map(int,input().split())
level=[]*(n+1)
level=list(input())

# 상민이가 첫 달에 29만원을 과금하고, 둘 째달에 30만원을 과금한다. 그리고 셋 째달에 59만원을 과금하면 최대 과금액이다.
# 조건문으로 등급을 확인하면서 기준액에서 1을 뺀 수만큼 정답값에 더해준다.

result=0
temp=0
for i in range(len(level)):

    if level[i]=='B':
        result+=(s-1)-temp
        temp=s-1-temp
    elif level[i]=='S':
        result+=(g-1)-temp
        temp=g-1-temp
    elif level[i]=='G':
        result+=(p-1)-temp
        temp=p-1-temp
    elif level[i]=='P':
        result +=(d-1)-temp
        temp=d-1-temp
    elif level[i]=='D':
        result+=d

print(result)