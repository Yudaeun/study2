
count=0

n=int(input())

coin_types=[500,100,50,10]

for coin in coin_types:
    count+=n//coin
    n%=coin

print(count)

