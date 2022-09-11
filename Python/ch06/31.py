import math
#주차 요금 계산

def solution(fees, records):
    answer = []
    record = []

    for i in records:
        record.append(i.split(' '))

    record.sort(key=lambda x: x[1])
    record.append(["0", "0", "0"])
    temp = record[0][1]
    total = 0

    for i in record:
        if temp != i[1]:
            temp = i[1]
            if in_time:
                a, b = in_time.split(':')
                total += (23 - int(a)) * 60 + (59 - int(b))

            if total > fees[0]:
                answer.append(math.ceil((total - fees[0]) / fees[2]) * fees[3] + fees[1])
            else:
                answer.append(fees[1])
            total = 0

        if i[2] == 'IN':
            in_time = i[0]
        elif i[2] == 'OUT':
            a, b = in_time.split(':')
            c, d = i[0].split(':')
            total += (int(c) - int(a)) * 60 + (int(d) - int(b))
            print(total, temp)
            in_time = 0

    return answer