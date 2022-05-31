#실패율
def solution(N, stages):
    fail={}
    len_s=len(stages)
    str_s=''.join([str(n) for n in stages])
    for i in range(1,N+1):
        if len_s!=0:
            cnt = str_s.count(str(i))
            ans=cnt/len_s
            fail[i]=ans
            len_s-=cnt
        else:
            fail[i]=0

    fail=sorted(fail,key=lambda x: fail[x], reverse=True)
    print(fail)
    return fail

solution(4,[4,4,4,4,4])