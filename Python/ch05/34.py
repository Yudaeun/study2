def solution(new_id):
    # 1단계
    new_id = new_id.lower()
    # 2단계
    new_id = list(map(str, new_id))
    temp = []
    for i in new_id:
        if 'a' <= i <= 'z' or '1' <= i <= '9' or i == '-' or i == '_' or i == '.':
            temp.append(i)
    # 3단계
    temp = ''.join(map(str, temp))
    for _ in range(len(temp)):
        temp=temp.replace('..', '.')

    # 4단계
    temp = list(map(str, temp))

    if len(temp)>= 1:
        if temp[0] == '.':
            temp.pop(0)
    if len(temp)>=1:
        if temp[-1] == '.':
            temp.pop()

    # 5단계
    temp = ''.join(map(str, temp))
    if temp == '':
        temp = 'a'

    # 6단계
    temp = list(map(str, temp))
    if len(temp) >= 16:
        temp = temp[:15]
        if temp[-1]=='.':
            temp.pop()
    # 7단계
    l = temp[-1]
    if len(temp) <= 2:
        for i in range(3):
            if len(temp) == 3:
                break
            temp.append(l)
    temp = ''.join(map(str, temp))
    return temp

print(solution("1234567890"))