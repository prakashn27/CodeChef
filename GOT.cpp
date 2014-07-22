#include <iostream>
using namespace std;

int main() {
	int t, num;
	cin>>t;
	while(t--) {
	cin>>num;
	if(num % 2) cout<<"Lannisters always pays their debts\n";
	else cout<<"Valar Morghulis\n";
	}
	return 0;
}
