#include <iostream>
#include<cmath>
using namespace std;

int main() {
	int t ;
	double ls, b, rsMax, rsMin;
	cin>>t;
	while(t--) {
	cin>>b>>ls;
	rsMax = sqrt(pow(ls,2) + pow(b,2));
	rsMin = sqrt(pow(ls,2) - pow(b,2));
	cout<<rsMin<<" "<<rsMax<<"\n";
	}
	return 0;
}
