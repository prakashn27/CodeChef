#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int t, num1, num2;
	cin>>t;
	while(t--){
	cin>>num1>>num2;
	cout<<std::max(num1,num2)<<" "<<num1+num2<<"\n";
	}
	return 0;
}
