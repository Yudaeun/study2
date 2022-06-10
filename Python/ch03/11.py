# 큰 수 만들기

n,m=map(int,input().split())
temp=0
mod=0
save=0
answer=[]

for i in m:
    if (i%10)>(save%10):
        answer.insert(0,i)
        save=i
    if (i%10)==0:
        answer.append(i)
    print(answer)
print(answer)
