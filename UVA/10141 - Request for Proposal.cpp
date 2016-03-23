 /*input
6 4
engine
brakes
tires
ashtray
vinyl roof
trip computer
Chevrolet
20000.00 3
engine
tires
brakes
Cadillac
70000.00 4
ashtray
vinyl roof
trip computer
engine
Hyundai
10000.00 3
engine
tires
ashtray
Lada
6000.00 1
tires
1 1
coffee
Starbucks
1.50 1
coffee
0 0
*/
#include <iostream>
#include <cstring>
#include <set>

#define min(a, b) a<b?a:b
#define max(a, b) a>b?a:b

using namespace std;
struct Proposal {
	string name;
	float price;
	set<string> met_req;
	float comp; // complaiance

	Proposal(string n, float p): name(n), price(p){}

};
int main() {
	int n, p, no_of_req;
	string name, winner = "";
	float price, min_comp = 1, comp;
	set<string> req;
	while(1) {
		cin >> n >> p;
		if(n==0) break;
		getline(cin,name);
		for(int i = 0; i < n; i++) {
			getline(cin,name);
		}
		getline (cin,name);
		for(int i = 0; i < p; i++) {
			getline (cin,name);
			cin >> price >> no_of_req;
			getline (cin,name);
			for(int j = 0; j < no_of_req; j++) {
				getline (cin,name);\
			}
			comp = (float) no_of_req/no_of_req;
			if(winner == "" || comp < min_comp) {
				min_comp = comp;
				winner = name;
			}
		}
		cout << "winner is " << winner;
	}
}