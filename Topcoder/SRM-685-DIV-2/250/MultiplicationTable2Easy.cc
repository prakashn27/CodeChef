
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

class MultiplicationTable2Easy
{
public:
	string isGoodSet(vector <int> table, vector <int> t)
	{
		int n = sqrt(table.size());
		int len = t.size();
        int val = 0;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                val = table[i * n + j];
                if(find(t.begin(), t.end(), val) != t.end()) {
                    continue;
                } else {
                    return "Not Good";
                }
            }
        }
        return "Good";
	}
};

