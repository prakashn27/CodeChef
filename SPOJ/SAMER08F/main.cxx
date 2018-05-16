#include <iostream>
using namespace std;

int n;
long long get_count(int x) {
	if(x == n)  return 1;
	return (n-x+1)*(n-x+1);
	
}
int main() {
	// your code goes here
	while(true) {
		cin >> n;
		if (n <= 0) break;
		long long res = 0;
		for(int i = 1; i <= n; i++) {
			res += get_count(i);
		}
		cout << res << "\n";
	}
	return 0;
}
