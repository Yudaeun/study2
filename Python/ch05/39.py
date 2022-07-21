from collections import deque
#주식가격
def solution(prices):
    answer = deque()

    for i in range(len(prices)):
        cnt = 0
        for j in range(i,len(prices)):
            if prices[i] > prices[j]:
                answer.append(j - i)
                break
            cnt += 1
            if j == len(prices) - 1:
                answer.append(cnt-1)
    answer=list(answer)
    return answer

print(solution([1,2,3,2,3]))