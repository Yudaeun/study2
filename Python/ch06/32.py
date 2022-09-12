from collections import deque


def solution(maps):
    answer = 0
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    x, y = 0, 0

    q = deque()
    q.append((x, y))

    while q:
        x, y = q.popleft()
        for i in range(4):

            nx = dx[i] + x
            ny = dy[i] + y
            if nx >= len(maps) or nx <= -1 or ny >= len(maps[0]) or ny <= -1:
                continue
            if maps[nx][ny] == 1:
                maps[nx][ny] = maps[x][y] + 1
                q.append((nx, ny))

    if maps[len(maps) - 1][len(maps[0]) - 1] > 1:
        return maps[len(maps) - 1][len(maps[0]) - 1]
    else:
        return -1