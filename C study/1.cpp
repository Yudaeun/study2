#큰 수의 법칙

#include <bits/stdc++.h> 

using namespace std;

int n,m,k;
vector<int> v;

int main() {
	cin>>n>>m>>k;
	
	for(int i=0;i<n;i++){
		int x;
		cin>>x;
		v.push_back(x);
	}
	sort(v.begin(),v.end())
	int first=v[n-1];
	int second=v[n-2];
	
	int count=(m/(k+1))*k;
	count+=m%(k+1);
	
	int result=0;
	
	result+=count*first;
	result+=(m-count)*second;
	
	cout<<result<<'\n';
	
}
