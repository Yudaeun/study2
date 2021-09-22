# 이진 탐색 알고리즘으로 부품 찾기 풀기
# 시간 복잡도 O((M+N)*logN)

def binary_search(array, target,start,end):
    while start<=end:
        mid=(start+end)//2
        # 값을 찾았으면 중간점 인덱스를 반환한다.
        if array[mid]==target:
            return mid
        # 중간점의 값보다 찾고자 하는 값이 작으면 왼쪽을 확인한다.
        elif array[mid]>target:
            end=mid-1
        # 중간점의 값보다 찾고자 하는 값이 큰 경우에 오른쪽을 확인한다.
        else:
            start=mid+1
    return None

# N(가게의 부품 개수)를 입력받는다.
n=int(input())
# 가게에 있는 전체 부품 번호를 공백으로 구분하여 입력받는다.
array=list(map(int,input().split()))
array.sort() #이진 탐색을 수행하기 위해 사전에 정렬을 수행한다.
# M(손님이 확인을 요청한 부품 개수)를 입력받는다.
m=int(input())
# 손님이 확인을 요청한 전체 부품 번호를 공백으로 구분하여 입력받는다.
x=list(map(int,input().split()))

# 손님이 확인을 요청한 부품 번호를 하나씩 확인한다.
for i in x:
    # 해당 부품이 존재하는지 확인한다.
    result=binary_search(array,i,0,n-1)
    if result!=None:
        print('yes',end=' ')
    else:
        print('no',end=' ')