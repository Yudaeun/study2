import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)

    while True:
        if scoville[0] >= K:
            break

        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        temp = first + second * 2
        if len(scoville)==0 and temp<K:
            return(-1)
        heapq.heappush(scoville, temp)
        answer += 1

    return answer
print(solution([1,2],3))