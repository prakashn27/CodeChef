#include <iostream>

using namespace std;
int getCycleCount(int n) {
	int count = 1;
	while(n != 1) {
		count++;
		if(n % 2 == 0) {
			n = n / 2;
		}
		else {
			n = 3 * n + 1;
		}
		//cout << n << " ";
	}
	return count;
}
#define max(a , b) (a>b)?a:b
int main() {
    int i, j;
    while(cin >> i >> j) {
        bool is_swap = false;
        if(i > j) {
            int temp = i;
            i = j;
            j = temp;
            is_swap = true;
        }
        int max_ = 0, cur;
        for(int c = i; c <= j ; c++) {
            cur  = getCycleCount(c);
            max_ = max(max_, cur);
        }
        if(is_swap) {
            cout << j << " " << i << " " << max_ << endl;
        } else {
            cout << i << " " << j << " " << max_ << endl;
        }
    }
}
