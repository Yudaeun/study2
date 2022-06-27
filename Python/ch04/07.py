n,k=map(int,input().split())
m=[]
for _ in range(n):
    num=int(input())
    m.append(num)

d=[0]*(k+1)
d[0]=1

for i in range(n):
    for j in range(m[i],k+1):
        d[j]+=d[j-m[i]]

if d[k]==0:
    print(0)
else:
    print(d[k])