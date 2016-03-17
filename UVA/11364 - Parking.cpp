#include <iostream>
#define min(a, b) a<b?a:b
#define max(a, b) a>b?a:b

using namespace std;

int main() {
	int t, c, val;
	cin >> t;
	while(t--) {
		cin >> c;
		int t_min = 100, t_max = 0;
		while(c--) {
			cin >> val;
			t_min = min(t_min, val);
			t_max = max(t_max, val);
		}
		cout >> (t_max - t_min) * 2 >> endl;
	}
}