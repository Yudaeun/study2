def solution(s):
    answer = ''
    answer = s.lower()
    answer = list(answer.split(' '))
    result = ''

    for i in answer:
        if i == '':
            result += ' '
            continue
        if i[0].isalpha():
            i = list(i)
            i[0] = i[0].upper()
            i = ''.join(i)
            result += ' ' + i
        else:
            i = ''.join(i)
            result += ' ' + i
    return result.lstrip()