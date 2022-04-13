# 떡의 개수(N)와 요청한 떡의 길이(M)을 입력받는다.
n,m=list(map(int,input().split()))
# 각 떡의 개별 높이 정보를 입력받는다.
array=list(map(int,input().split()))

# 이진 탐색을 위한 시작점과 끝점을 설정한다.
start=0
end=max(array)

# 이진 탐색을 반복적으로 수행한다.
result=0
while(start<=end):
    total=0
    mid=(start+end)//2
    for x in array:
        # 잘랐을 때의 떡의 양을 계산한다.
        if x>mid:
            total+=x-mid
    # 떡의 양이 부족한 경우에는 더 많이 자른다.(왼쪽 부분을 탐색)
    if total<m:
        end=mid-1
    # 떡의 양이 충분한 경우에는 덜 자른다.(오른쪽 부분을 탐색)
    else:
        result=mid # 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록한다.
        start=mid+1

print(result)