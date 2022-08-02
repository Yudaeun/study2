def solution(n):
    answer = ''
    while n:
        mod=n%3
        if mod==0:
            n-=1
            answer+='4'
        elif mod==1:
            answer+='1'
        elif mod==2:
            answer+='2'
        n=n//3

    return answer[::-1]
print(solution(9))