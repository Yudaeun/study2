from itertools import combinations

def solution(orders, course):
    new_orders=[]
    com_orders=[]
    for i in orders:
        new_orders.append(list(i))
    for i in new_orders:
        for j in course:
            com_orders.append(list(combinations(i,j)))
    com_orders=sum(com_orders,[])
    answer={}
    for i in com_orders:
        if ''.join(i) in answer:
            answer[''.join(i)]+=1

        else:
            answer[''.join(i)]=1

    temp=0
    result=[0]*(len(course)+1)
    real_result=[0]*(len(course)+1)

    for cnt in course:
        max_num=0
        for i in answer:
            if cnt==len(i) and answer[i]>=2:
                max_num=max(max_num,answer[i])
                if max_num==answer[i]:
                    real_result[-1]=i
                if max_num>result[temp]:
                    result[temp]=max_num
                    real_result[temp]=i
        temp+=1
    return real_result

print(solution(["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"],[2,3,5]))