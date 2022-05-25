# 폰켓몬

def solution(nums):
    length=int(len(nums)/2)
    nums=set(nums)
    answer=len(nums)
    if answer>length:
        answer=length
    return answer

solution([3,1,2,3])