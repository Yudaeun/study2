def solution(num):
    answer = 0
    while True:
        if num % 2 == 0:
            num = num // 2
            answer += 1
        if num == 1:
            return answer
        if num % 2 == 1:
            num = num * 3 + 1
            answer += 1
        if answer>=500:
            return -1

print(solution(6))