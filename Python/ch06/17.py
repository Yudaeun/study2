def solution(progresses, speeds):
    answer = []
    result = []
    # 각 pro의 값+각 speeds의 값>=100이 될 때 answer에 더한 횟수를 넣음(루프의 i)
    # answer만큼 루프돌면서 현재값>다음값이 될 때 현재값을 result에 넣음

    for i in range(len(progresses)):
        temp = progresses[i]
        for j in range(1, 101):
            temp += speeds[i]
            if temp >= 100:
                answer.append(j)
                break
    cnt=0
    #answer=[5,1,2,3]
    temp = answer[0]
    for i in range(len(answer)):
        cnt+=1
        if i==len(answer)-1:
            result.append(cnt)
            break
        if temp<answer[i+1]:
            result.append(cnt)
            cnt=0
            temp=answer[i+1]
    return result
print(solution([93, 30, 55],[1,30,5]))
print(solution([95, 90, 99, 99, 80, 99],[1,1,1,1,1,1]))
print(solution([95,95,95,95],[4,3,2,1]))
# 2 2 3 5 -> 2 1 1