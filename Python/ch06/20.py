from collections import deque


def solution(priorities, location):
    num = [i for i in range(len(priorities))]

    q = deque()
    n = deque()
    for i in priorities:
        q.append(i)
    for i in num:
        n.append(i)

    cnt = 0
    while q:
        m = max(q)
        temp = q.popleft()
        if not m == temp:
            q.append(temp)
            t = n.popleft()
            n.append(t)

        else:
            t = n.popleft()
            cnt += 1
            if t == location:
                return cnt