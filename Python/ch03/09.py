def solution(a, b):
    week = {1: 'FRI', 2: 'SAT', 3: 'SUN', 4: 'MON', 5: 'TUE', 6: 'WED', 0: 'THU'}
    thirtyone = [1, 3, 5, 7, 8, 10, 12]
    thirty = [4, 6, 9, 11]
    count=0

    for i in range(1,a):
        if i in thirtyone:
            count+=31
        elif i in thirty:
            count+=30
        else:
            count+=29
    count+=b

    print(count)
    mod = count % 7
    print(week[mod])
    return week[mod]

solution(5,24)