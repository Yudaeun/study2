from itertools import combinations
from collections import Counter

def solution(orders, course):
    answer=[]

    for j in course:
        new_orders = []
        for i in orders:
            i=sorted(i)
            new_orders.extend(list(combinations(i,j)))

        count=Counter(new_orders)

        if count:
            if max(count.values())>=2:
                for key,value in count.items():
                    if value==max(count.values()):
                        answer.append("".join(key))
    return sorted(answer)

print(solution(["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"],[2,3,5]))