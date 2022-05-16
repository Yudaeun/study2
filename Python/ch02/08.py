# 신고 결과 받기


def solution(id_list,report,k):
    answer=[0]*len(id_list) # 결과안내메일 받은 횟수

    user_reports={x:0 for x in id_list}

    for i in set(report):
        user_reports[i.split()[1]]+=1

    for i in set(report):
        if user_reports[i.split()[1]]>=k:
            answer[id_list.index(i.split()[0])]+=1

    return answer

