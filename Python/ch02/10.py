#효율적인 화폐 구성

n,m=map(int,input().split())
array=[]
for i in range(n):
    array.append(int(input()))

d=[10001]*(m+1)

d[0]=0
for k in range(n):
    for i in range(array[k],m+1):
            d[i]=min(d[i],d[i-array[k]])

if d[m]==10001:
    print(-1)
else:
    print(d[m])