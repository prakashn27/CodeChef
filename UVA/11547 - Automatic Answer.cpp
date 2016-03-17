 #include <iostream>

using namespace std;

int get_result(int a) {
	int n = a*567;
	n =/ 9;
	n += 7492;
	n *= 235;
	n /= 47;
	n -= 498;
	n = n/10;
	n = n % 10;
	return n;
}

int main() {
	int t, a;
	cin >> t;
	while(t--) {
		cin >> a;
		cout << get_result(a) << endl;
	}
	
	
}