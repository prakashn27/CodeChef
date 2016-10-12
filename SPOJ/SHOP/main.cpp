/*
 http://www.spoj.com/problems/SHOP/
*/
#include <iostream>
#include <stack>
#include <queue>
#include <vector>
#include <string>
// #define DEBUG 1
using namespace std;



// helper functions 
template<typename T>
void print_vec(vector<vector<T> > path) {
	#ifdef DEBUG 
		for (auto i = path.begin(); i != path.end(); ++i) {
			auto row = *i;
			for(auto j = row.begin(); j != row.end(); ++j)
	    		std::cout << *j << '\t';
	    	cout << endl;
		}
	#endif	
}

void log_info(string l) {
	#ifdef DEBUG
		cout << l << endl;
	#endif
}

struct Node {
	int i, j;
	Node() {

	}

	Node(int ii, int jj) {
		i = ii;
		j = jj;
	}
	void print() {
		#ifdef DEBUG 
			cout << i << ":" << j << endl;
		#endif	
	}
};

int main() {
	int w, h;
	vector<vector<int> > grid, dist_grid;
	vector<vector<bool> > is_visited;
	Node s; 
	Node d;
	cin >> w;
	cin >> h;
	while(w != 0 && h != 0) {
		queue<Node> q;
		char ch;
		#ifdef DEBUG 
			cout << h << " : " << w << endl;
		#endif	
		string row;
		getline(cin, row);
		vector<int> temp;
		for(int i = 0; i < h; ++i) {
			getline(cin, row);
			vector<int> dist_temp (w, 1000);
			dist_grid.push_back(dist_temp);
			vector<bool> temp_bool (w, false);
			is_visited.push_back(temp_bool);
			for(int j = 0; j < row.length(); ++j) {
				ch = row.at(j);
				switch(ch) {
					case 'X':
					case 'x':
						temp.push_back(1000);
						is_visited[i][j] = true;
						break;
					case 'S':
					case 's':
						temp.push_back(0);
						dist_grid[i][j] = 0;
						s.i = i;
						s.j = j;
						break;
					case 'D':
					case 'd':
						temp.push_back(0);
						d.i = i;
						d.j = j;
						break;
					default:
						temp.push_back(ch - '0');
				}
			}
			row = "";
			grid.push_back(temp);
			temp.clear();
		}
		print_vec(grid);
		print_vec(dist_grid);
		print_vec(is_visited);

		log_info("check and update the dist_grid for shortest path");
		q.push(s);
		log_info("check all sides if valid update the dist_grid");
		while(!q.empty()) {
			Node cur = q.front();
			int x = cur.i;
			int y = cur.j;
			int cur_dist = dist_grid[x][y];
			cout << "cur is ";
			cur.print();
			// check all 4 sides
			if(x-1 >= 0) {
				Node top(x-1, y);
				int new_dist = grid[x-1][y];
				if(cur_dist + new_dist < dist_grid[x-1][y] && !is_visited[x-1][y]) {
					cout << "cur_dist " << cur_dist << " new_dist " << new_dist << " top is ";
					top.print();
					dist_grid[x-1][y] = cur_dist + new_dist;
					q.push(top);
				}
			}
			if(x+1 < h) {
				Node bottom(x+1, y);
				int new_dist = grid[x+1][y];
				if(cur_dist + new_dist < dist_grid[x+1][y] && !is_visited[x+1][y]) {
					cout << "cur_dist " << cur_dist << " new_dist " << new_dist << " bottom is ";
					bottom.print();
					dist_grid[x+1][y] = cur_dist + new_dist;
					q.push(bottom);
				}
			}
			if(y-1 >= 0) {
				Node left(x, y-1);
				int new_dist = grid[x][y-1];
				cout << "new dist in left is " << new_dist << ":" << cur_dist << ":" << dist_grid[x][y-1] << endl;
				if(cur_dist + new_dist < dist_grid[x][y-1] && !is_visited[x][y-1]) {
					cout << "cur_dist " << cur_dist << " new_dist " << new_dist << " left is ";
					left.print();
					dist_grid[x][y-1] = cur_dist + new_dist;
					q.push(left);
				}
				
			}
			if(y+1 < w) {
				Node right(x, y+1);
				int new_dist = grid[x][y+1];
				if(cur_dist + new_dist < dist_grid[x][y+1] && !is_visited[x][y+1]) {
					cout << "cur_dist " << cur_dist << " new_dist " << new_dist << " right is ";
					right.print();
					dist_grid[x][y+1] = cur_dist + new_dist;
					q.push(right);
				}
			}
			q.pop();
		}

		log_info("dist_grid after computation");
		print_vec(dist_grid);
		log_info("##########");
		print_vec(is_visited);

		log_info("#######");
		cout << "result is " << dist_grid[d.i][d.j] << endl;


		log_info("clearing and freeing memory");
		grid.clear();
		dist_grid.clear();
		s.print();
		d.print();
		cin >> w;
		cin >> h;
	}
	return 0;
}
