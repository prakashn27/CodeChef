 /*input
10 2 1 50
0 0 0 0
*/
#include <iostream>

#define min(a, b) a<b?a:b
#define max(a, b) a>b?a:b

using namespace std;

int main() {
	int h, d, f, dia;
	float u, alt, dep;
	while(1) {
		cin >> h >> u >> d >> f;
		if(h == 0) break;
		dia = 1;
		alt = 0;
		dep = f*u/100;
		while(1) {
			alt += u;
			if(u > 0) {
				u -= dep;
			}
			if(alt > h) break;
			alt -= d;
			if(alt < 0) break;
			dia++;
		}
		if(alt < 0)
			cout << "failure on day ";
		else
			cout << "success on day ";
		cout << dia << endl;
	}
}