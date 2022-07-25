
n=int(input())
search=list(map(int,input().split()))

for i in range(n-1,0,-1):
    if search[i]<search[i-1]:
        for j in range(n-1,0,-1):
            if search[j]<search[i-1]:
                search[j],search[i-1]=search[i-1],search[j]
                search=search[:i]+sorted(search[i:],reverse=True)
                print(search)
                exit()
print(-1)