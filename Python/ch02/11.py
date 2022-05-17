def solution(lottos, win_nums):
    answer = [0,0]
    count = 0
    ans_cnt = 0
    rank=[6,6,5,4,3,2,1]

    for i in lottos:
        if i==0:
            count+=1
        if i in win_nums:
            ans_cnt+=1

    result=count+ans_cnt
    answer[0]=rank[result]
    answer[1]=rank[ans_cnt]

    return answer

print(solution([44, 1, 0, 0, 31, 25],[31, 10, 45, 1, 6, 19]))