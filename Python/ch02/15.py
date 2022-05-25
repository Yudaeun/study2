# 숫자 문자열과 영단어
def solution(s):
    answer = ''
    word=['zero','one','two','three','four','five','six','seven','eight','nine']

    for idx,num in enumerate(word):
        if num in s:
            s=s.replace(num,str(idx))
        answer=s
    print(answer)
    return answer


solution("one43seveneight")