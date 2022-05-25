# 없는 숫자 더하기
def solution(numbers):
    answer = -1
    sum=0

    for i in numbers:
        sum+=i
    answer=45-sum
    print(answer)
    return answer

a=[5,8,4,0,6,7,9]
solution(a)