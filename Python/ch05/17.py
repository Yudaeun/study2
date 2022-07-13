from collections import Counter

def solution(clothes):
    answer=1
    new=[]
    for i in clothes:
        new.append(i[1])

    num=list(Counter(new).values()) # 중복되는 옷의 가짓수를 저장
    print(num)
    for i in range(len(num)):
        #착용할 수 있는 모든 경우의 수를 구하려면 종류의 갯수를 다 곱한다.
        #착용하지 않는 경우도 있기 때문에 종류의 갯수에 1씩 더해야 한다.
        #아무것도 입지 않는 경우는 없기 때문에 마지막에 1을 빼줘야 한다.
        answer=(answer*((num)[i]+1))
        print(answer)
    return answer-1

print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))