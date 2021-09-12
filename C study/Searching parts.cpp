#include <bits/stdc++.h>

using namespace std;

// ���� Ž�� �ҽ��ڵ� ����(�ݺ���)
int binarySearch(vector<int>& arr, int target, int start, int end){
	while(start<=end){
		int mid=(start+end)/2;
		// ã�� ��쿡 �߰��� �ε����� ��ȯ�Ѵ�.
		if (arr[mid]==target) return mid;
		// �߰����� ������ ã���� �ϴ� ���� �۴ٸ� ������ Ȯ���Ѵ�.
		else if (arr[mid]>target) end=mid-1;
		// �߰����� ������ ã���� �ϴ� ���� ũ�ٸ� �������� Ȯ���Ѵ�.
		else start=mid+1;
	}
	return -1;
} 

// N(������ ��ǰ ����)�� M(�մ��� Ȯ���� ��û�� ��ǰ ����)
int n,m;
//���Կ� �ִ� ��ü ��ǰ ��ȣ��
vector<int> arr; //���ʹ� array�� ��������� ������ ũ�Ⱑ ���� linked list��  ����� �ڷ���
//�մ��� Ȯ���� ��û�� ��ǰ ��ȣ��
vector<int> targets;

int main(void){
	cin>>n;
	for(int i=0;i<n;i++){
		int x;
		cin>>x;
		arr.push_back(x); //push_back�� ������ ���� ��Ҹ� �߰��ϴ� �Լ� 
	}
	
	//���� Ž���� �����ϱ� ���� ������ ������ �����Ѵ�.
	sort(arr.begin(),arr.end());
	
	cin>>m;
	for(int i=0;i<m;i++){
		int target;
		cin>>target;
		targets.push_back(target);
	} 
	//�մ��� Ȯ�� ��û�� ��ǰ ��ȣ�� �ϳ��� Ȯ���Ѵ�.
	for(int i=0;i<m;i++){
		//�ش� ��ǰ�� �����ϴ��� Ȯ���Ѵ�.
		int result=binarySearch(arr,targets[i],0,n-1);
		if(result!=-1){
			cout<<"yes"<<' ';
		} 
		else{
			cout<<"no"<<' ';
		}
	} 
} 
