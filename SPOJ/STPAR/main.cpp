/*
 http://www.spoj.com/problems/STPAR/
*/
#include <iostream>
#include <stack>
#include <queue>
#include <algorithm>
using namespace std;
 
int main() {
	int n, x, c;
	std::queue<int> main;
	std::stack<int> side;
	cin >> n;
	while(n != 0) {
		c = 1;
		main.push(0);
		for(int i=0; i<n; i++) {
			//cout << "i:" << i ;
			cin>>x;
			//cout << " x:" << x << endl;
			main.push(x);
		}
		while(!main.empty() || !side.empty())
		{
			if(!main.empty() && main.front() == c) {
				main.pop();
				c++;
			} 
			else {
				if(!side.empty() && side.top() == c) {
					side.pop();
					c++;
				}
				else {
					if(!main.empty()) {
						side.push(main.front());
						main.pop();
					} else {
						break;
					}
				}
			}
		}
		
		if(c == n+1) cout << "yes" << endl;
		else 		 cout << "no" << endl;
		cin >> n;
	}
	return 0;
}