from itertools import combinations


def solution(nums):
    answer = 0
    com = list(combinations(nums, 3))
    for i in range(len(com)):
        sum=0
        for j in range(len(com[i])):
            sum+=com[i][j]
        count=0
        for a in range(2,sum):
            if sum%a==0:
                count+=1
        if count==0:
            answer+=1
    print(answer)
    return answer

solution([1,2,7,6,4])