#include <bits/stdc++.h>

using namespace std;

//떡의 개수(N)과 요청한 떡의 길이(M)
int n, m;

// 각 떡의 개별 높이 정보
vector<int> arr;

int main(void){
	cin>>n>>m;
	for (int i=0;i<n;i++){
		int x;
		cin>>x;
		arr.push_back(x);
	}
	//이진 탐색을 위한 시작점과 끝점 설정
	int start=0;
	int end=1e9;
	// 이진 탐색 수행을 반복적으로 시행한다.
	int result=0;
	while(start<=end){
		long long int total=0;
		int mid=(start+end)/2;
		for(int i=0;i<n;i++){
			//잘랐을 때의 떡의 양 계산
			if(arr[i]>mid) total+=arr[i]-mid; 
		}
		if(total<m){ //떡의 양이 만약 부족하다면 더 많이 잘라야 하므로 왼쪽 부분 탐색한다.
			end=mid-1; 
		}
		else{
			//떡의 양이 충분하다면 덜 잘라야 하므로 오른쪽 부분을 탐색한다.
			result=mid;
			start=mid+1; 
		}
	} 
	cout<<result<<'\n';
} 
