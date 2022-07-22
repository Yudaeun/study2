n=int(input())
graph=list(map(int,input().split()))

# 모험가를 정렬한 후에 하나씩 확인하면서 sum을 팀원 수로 하고,
# 루프 하나 더 돌면서 sum값이 팀원들의 공포도 총합보다 같거나 커지면 그 팀원 remove하고 카운트 증가
count=0
graph.sort()
temp=0
for i in graph:
    temp+=1
    if temp>=i:
        count+=1
        temp=0
print(count)