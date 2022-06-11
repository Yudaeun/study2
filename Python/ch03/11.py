# 큰 수 만들기
from functools import cmp_to_key

n=int(input())
m=list(map(int,input().split()))

def compare(x,y):
    if str(x)+str(y)>str(y)+str(x):
        return -1 #x가 먼저 정렬된다.
    elif str(x)+str(y)<str(y)+str(x):
        return 1 # y가 먼저 정렬된다.
    return 0 # 순서가 변하지 않음

m.sort(key=cmp_to_key(compare)) # cmp_to_key는 두 수의 str화 되어 있는 숫자일 때 비교해서 정렬한다.
count=0

for i in m:
    if i==0:
        count+=1 #0의 개수를 센다.
if count==len(m): # 만약 전부 0이라면 0 하나만 출력
    print(0)
else:
    for i in m:
        print(i,end='')

