// {{{ VimCoder 0.3.6 <-----------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

using namespace std;

// }}}

class SortingSubsets
{
public:
	int getMinimalSize(vector <int> a)
	{
		vector<int> b = a;
		int cnt = 0;
		sort(a.begin(), a.end());
		for(int i = 0; i < a.size(); i++) {
			if(a[i] != b[i]) cnt++;
		}
		return cnt;
	}
};

