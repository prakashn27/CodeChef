//136 - Ugly Numbers
#include <iostream>
#include <vector>

#define max(a, b) a>b?a:b

using namespace std;

int min(int a, int b, int c) {
	if(a <= b) {
		if(a <= c) {
			return a;
		}
		else {
			return c;
		}
	} else if(b <= c){
		return b;
	} else {
		return c;
	}
}

int main() {
	int t = 1500, a;
	//cin >> t;
	std::vector<int> v;
	v.resize(1501);
	int v_index = 0;
	v[v_index] = 1;
	int i2 = 0, i3 = 0, i5 = 0;
	int next_multiple_2 = 2;
	int next_multiple_3 = 3;
	int next_multiple_5 = 5;
	int next_ugly;
	while(v_index < 1500) {
		next_ugly = min(next_multiple_2, next_multiple_3, next_multiple_5);
		++v_index;
		v[v_index] = next_ugly;
		if(next_ugly == next_multiple_2) {
			next_multiple_2 = v[++i2]*2;
			// i2++;
		}
		if(next_ugly == next_multiple_3) {
			next_multiple_3 = v[++i3]*3;
			// i3++;
		}
		if(next_ugly == next_multiple_5) {
			next_multiple_5 = v[++i5]*5;
			// i5++;
		}
	}
	cout << next_ugly << endl;
}