//11799 - Horror Dash

#include <iostream>
#define max(a, b) a > b ? a : b

using namespace std;


int main() {
	int t, n, a, count = 0;
	cin >> t;
	while(count++ < t) {
		cin >> n;
		int _max = 0;
		while(n--) {
			cin >> a;
			_max = max(_max, a);
		}
		cout << "Case " << count << ": " << _max << endl;
	}
}