#1=1 ->1개
#2=1+1,2 ->2개
#3=1+1+1,1+2,2+1,3->4개
#4=7개
#5=13,6=24, 7=44
# 1,2,3더하기

t=int(input())

d=[0]*11
d[0],d[1],d[2]=1,2,4

for i in range(3,11):
    d[i]=d[i-3]+d[i-2]+d[i-1]

for _ in range(t):
    n=int(input())
    print(d[n-1])