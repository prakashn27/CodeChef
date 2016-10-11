/*
 http://www.spoj.com/problems/SHOP/
*/
#include <iostream>
#include <stack>
#include <queue>
#include <vector>
#include <string>
using namespace std;

// void print_vec(std::vector<std::vector<int> > path) {
// 	for (auto i = path.begin(); i != path.end(); ++i) {
// 		auto row = *i;
// 		for(auto j = row.begin(); j != row.end(); ++j)
//     		std::cout << *j << ' ';
//     	cout << endl;
// 	}
// }
 
int main() {
	int w, h;
	cin >> w;
	cin >> h;

	while(w != 0 && h != 0) {
		vector<vector<char> > grid;
		vector<vector<int> > dist_grid;
		cout << h << " : " << w << endl;
		string row = "";
		getline(cin, row);
		std::vector<char> temp;
		vector<vector<char> >::iterator main_itr = grid.begin();
		for(int i = 0; i < h; ++i) {
			getline(cin, row);
			cout << row << endl;
			std::vector<char>::iterator it = temp.begin();
			for(int j = 0; j < row.length(); ++j) {
				cout << row.at(j) << " ";
				temp.insert(it, row.at(j));
			}	
			grid.insert(main_itr, temp);	
			row = "";
			temp.clear();
		}


		grid.clear();
		dist_grid.clear();
		cin >> w;
		cin >> h;
	}
	return 0;
}
