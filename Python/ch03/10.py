# 최소직사각형

def solution(sizes):
    answer = 0
    list1 = []
    list2 = []

    for i in sizes:
        list1.append(max(i))
        list2.append(min(i))
    answer = max(list1) * max(list2)

    return answer