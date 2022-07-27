n=int(input())
steps=[0]
for i in range(n):
    steps.append(int(input()))
answer=0
d=[0]*(n+1)
d[1]=steps[1]
if n==1:
    print(steps[0])
    exit()
if n==2:
    print(sum(steps))
    exit()
cnt=0
d[2]=steps[1]+steps[2]
for i in range(3,n+1):
    d[i]=max(d[i-3]+steps[i-1]+steps[i],d[i-2]+steps[i])

print(d[n])