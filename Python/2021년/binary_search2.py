# 반복문으로 구현한 이진 탐색 소스코드

def binary_search(array, target, start, end):
    while start<=end:
        mid=(start+end)//2
        #찾았으면 중간점 인덱스를 반환한다.
        if array[mid]==target:
            return mid
        #중간점의 값보다 찾고자 하는 값이 작은 경우에는 왼쪽을 확인한다.
        elif array[mid]>target:
            end=mid-1
        #중간점의 값보다 찾고자 하는 값이 큰 경우에는 오른쪽을 확인한다.
        else:
            start=mid+1
    return None

# n(원소긩 개수)와 target( 찾고자 하는 문자열)을 입력
n, target=list(map(int,input().split()))
# 전체 원소를 입력
array=list(map(int,input().split()))

#이진 탐색 수행 결과를 출력
result=binary_search(array,target,0,n-1)
if result==None:
    print("원소가 존재하지 않습니다.")
else:
    print(result+1)