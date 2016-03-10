#include <iostream>

using namespace std;

int main() {
	int i, a, b, c;
	while(1) {
		cin >> i >> a >> b >> c;
		if(!i && !a && !b && !c) {
			break;
		}
		int deg = 720 + 360 + 9 * (((a>i?(40-a)+i:(i-a)) + (b<a?(40-a)+b:(b-a)) + (c>b?(40-c)+b:(b-c))));
		cout << deg << endl;
	}
	return 0;
}