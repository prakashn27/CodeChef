 /*input
4 4 5
...#
*#O.
*.*.
*.#.
FFEFF
*/
#include <iostream>
#include <string>
#define min(a, b) a<b?a:b
#define max(a, b) a>b?a:b

using namespace std;

int main() {
	int m, n, s;
	int mm, nn;
	string line;
	while(true) {
		cin >> n >> m >> s;
		if(n == 0 || m == 0 || s == 0) {
			break;
		}
		char arena[n][m];
		nn = 0;
		while(nn++ < n) {
			cin >> line;
			cout << line  << endl;
			for(int i = 0; i < m; i++) {
				arena[nn][i] = line[i];
			}
			
		}
	}
}
