# 감소하는 수, 풀이 참고

import sys
from itertools import combinations

n=int(input())
nums=[]
for i in range(1,11):
    for comb in combinations(range(0,10),i):
        comb=list(comb)
        comb.sort(reverse=True)
        print(int("".join(map(str,comb))))
        nums.append(int("".join(map(str,comb))))

nums.sort()

try:
    print(nums[n])
except:
    print(-1)