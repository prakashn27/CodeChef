#include <iostream>

using namespace std;
#define max(a, b) a > b ? a : b
#define min(a, b) a < b ? a : b

int main() {
	int t, a, b, c, _max, _min;
	cin >> t;
	int count = 0;
	while(count++ < t) {
		cin >> a >> b >> c;
		_max = max(a, b);
		_max = max(_max, c);

		_min = min(a, b);
		_min = min(_min, c);

		if(a == _max || a == _min) {
			if(b == _max || b == _min) {
				cout << "Case " << count << ": " << c << endl;
			} else {
				cout << "Case " << count << ": " << b << endl;
			}
		} else {
			cout << "Case " << count << ": " << a << endl;
		}
	}
}