import sys
from collections import deque
# 전체중에 벽을 하나만 부술 수 있다.
# 벽 하나 부순 걸 전부 탐색한다. 2중 루프 돌면서 벽을 발견하면 거기를 지우고
# bfs를 돈다. 근데 이거 시간초과 날 것 같은데...흠
# 1000*1000=10000000 백만 음....
n, m = map(int, input().split())
num = []
for _ in range(n):
    num.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs():
    q = deque()
    q.append(0, 0)
    visited = [[0]*n for _ in range(m)]
    while q:
        cx, cy = q.popleft()
        for i in range(4):
            nx, ny = cx+dx[i], cy+dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if visited[nx][ny] == 0 and num[nx][ny] == 0:
                q.append((nx, ny))
                visited[nx][ny] = visited[cx][cy]+1
    return visited[n][m]


answer = 0
for i in range(n):
    for j in range(m):
        if num[i][j] == 1:
            num[i][j] = 0
            temp = bfs()
            if temp != 0:
                answer = min(answer, temp)
            num[i][j] = 1

if answer == 0:
    print(-1)
else:
    print(answer)
