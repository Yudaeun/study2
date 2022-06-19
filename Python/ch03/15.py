n=int(input())
m=map(int,input().split())
min,max=1000000,-1000000

for i in m:
    if i<min:
        min=i
    if i>max:
        max=i
print(min,max)