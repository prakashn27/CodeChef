#include <iostream>
#include <vector>
#define min(a, b) a<b?a:b
using namespace std;


int main() {
	int n, b, h, w, p;
	int min_stay;
	vector<int> availability;
	while(scanf("%ld %ld %ld %ld",&n,&b,&h,&w) != EOF) {
		min_stay = 500001;
		for(int i = 0; i < h; i++) {
			cin >> p;
			bool is_accomodated = false;
			availability.resize(w+1);
			for(int i = 0; i < w; i++) {
				cin >> availability[i];
				if(availability[i] >= n && !is_accomodated) {
					is_accomodated = true;
				}
			}
			if(is_accomodated) {
				min_stay = min(min_stay, n * p);
			}
			availability.clear();
		}
		if(min_stay == 99999999 || min_stay > b) {
			cout << "stay home" << endl;
		} else {
			cout << min_stay << endl;
		}
	}
}