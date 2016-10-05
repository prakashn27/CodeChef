#include <iostream>
#include <stack>
using namespace std;
 
int main() {
	int n, x, c;
	stack<int> main_stack;
	stack<int> side;
	bool reordered;
	cin >> n;
	while(n != 0) {
		c = 1;
		for(int i = 0; i < n; i++) {
			cin >> x;
			main_stack.push(x);
		}

		while(!main_stack.empty() || !side.empty())
		{
			if(!main_stack.empty() && main_stack.top() == c) {
				main_stack.pop();
				c++;
			} 
			else if(!side.empty() && side.top() == c) {
				side.pop();
				c++;
			}
			else {
				side.push(main_stack.top());
				main_stack.pop();
			}
		}
		
		if(c == n+1) cout << "yes" << endl;
		else 		 cout << "no" << endl;
		cin >> n;
	}
	return 0;
}