def solution(d, budget):
    answer = 0
    d_sum=sum(d)-budget
    d.sort()
    sum_total=0
    for i in d:
        if d_sum==0:
            return len(d)
        sum_total+=i
        budget-=i
        answer+=1
        print(budget,answer)
        print("-",sum_total)
        if budget<sum_total:
            return answer

solution([1,1,1,1,2],2)