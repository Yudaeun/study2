def solution(s):
    answer = ''
    # s를 공백을 기준으로 다 잘라서 리스트에 int로 다 넣고 max값과 min값 출력
    # 마지막에 answer에 join써서 합치기
    num=s.split(' ')
    num=[int(i) for i in num]
    answer+=str(min(num))
    answer+=' '
    answer+=str(max(num))
    return answer