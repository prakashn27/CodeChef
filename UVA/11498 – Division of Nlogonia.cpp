#include <iostream>

using namespace std;

int main() {
	int t, corx, cory, x, y;
	
	while(true) {
		cin >> t;
		if(!t) break;
		cin >> corx >> cory;
		while(t--){
			cin >> x >> y;
			int realx = x - corx;
			int realy = y - cory;
			if(realx == 0 || realy == 0) {
				cout << "divisa" << endl;
			} else if(realx > 0 && realy > 0) {
				cout << "NE" << endl;
			} else if(realx < 0 && realy > 0) {
				cout << "NO" << endl;
			} else if(realx > 0 && realy < 0) {
				cout << "SE" << endl;
			} else {//if(realx < 0 && realy < 0) {
				cout << "SO" << endl;
			}
		}
	}
}