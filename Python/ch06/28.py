n=int(input())
m=int(input())

if m>0:
    bremo=list(map(str,input().split()))
elif m==0:
    print(len(list(str(n))))
    exit()

temp=n
count=0
min_c=1000000

for i in range(1000000):
    for j in list(str(i)):
        if j in bremo:
            break
    else:
        count=len(list(str(i)))+abs(i-n)

        min_c=min(min_c,count)
print(min_c)