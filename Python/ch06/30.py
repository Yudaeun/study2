import math
#영어 끝말잇기
def solution(n, words):
    answer = []
    temp = [words[0]]
    for i in range(1, len(words)):
        last = words[i - 1][-1]  # 이전 단어의 마지막 문자 저장
        if (last != words[i][0]) or (words[i] in temp):
            mod = (i + 1) % n
            if mod == 0:
                answer.append(n)
            else:
                answer.append(mod)

            answer.append(math.ceil((i + 1) / n))
            return answer

        temp.append(words[i])  # 스택에 현재 단어 넣기

    zero = [0, 0]
    return zero