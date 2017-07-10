#include <iostream>
#include <string>
using namespace std;

int main() {
	// your code goes here
	string path;
	cin >> path;
	
	int floors = 0;
	for(int i = 0; i < path.length(); i++) {
		if(path[i] == '(') floors++;
		else if(path[i] == ')') floors--;
	}
	cout << floors;
	return 0;
}
