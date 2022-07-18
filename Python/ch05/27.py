# 맨해튼 거리가 2이하.x1-x2+y1-y2
# 맨해튼 거리가 2이하일때 0을 담고 리턴,
# 상하좌우 확인하면서 대각선에 P가 있는데 상하좌우로 파티션이 있으면 0 리턴
from collections import deque
dx=[-1,1,0,0]
dy=[0,0,-1,1]
answer=[]
def solution(places):
    def bfs(x,y,temp):
        visited = [[0] * 5 for _ in range(5)]
        q=deque()
        q.append((x,y,0))
        visited[x][y]=1
        while q:
            x,y,cost=q.popleft()
            if cost>=2:
                continue
            #맨해튼 거리가 2이상이라면 무시
            for i in range(4):
                nx=x+dx[i]
                ny=y+dy[i]
                if nx<=-1 or nx>=5 or ny<=-1 or ny>=5:
                    continue
                if visited[nx][ny]==1:
                    continue
                if temp[nx][ny]=='P':
                    return False
                if temp[nx][ny]=='O':
                    q.append((nx,ny,cost+1))
                    visited[nx][ny]=1
                    #빈자리라면 큐에 거리와 위치를 넣고 방문처리
        return True

    for place in places:
        temp=[]
        for i in place:
            temp.append(list(''.join(map(str,i))))
        flag=True
        for i in range(5):
            for j in range(5):
                if temp[i][j]=='P':
                    if not bfs(i,j,temp):
                        flag=False
                        break

        if flag:
            answer.append(1)
        else:
            answer.append(0)
    return answer


print(solution([["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"], ["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"], ["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"], ["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"], ["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]]))