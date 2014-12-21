
#include <algorithm>
#include <bitset>
#include <cassert>
#include <cctype>
#include <climits>
#include <cmath>
#include <cstddef>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <complex>
#include <deque>
#include <fstream>
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
#include <string>
#include <utility>
#include <valarray>
#include <vector>

using namespace std;

namespace SQRBR {
int dp[55][55]; //pos, #open left
bool open[55];

void solve(int test_num) {
	//void * memset ( void * ptr, int value, size_t num );
	//Fill block of memory
	//Sets the first num bytes of the block of memory pointed by ptr to the specified value (interpreted as an unsigned char).
	memset(open, false, sizeof (open)); //initialising to false
	memset(dp, 0, sizeof (dp));			//initialising to 0
	int len, opencnt;
	scanf("%d %d", &len, &opencnt);
	len <<= 1;  //multiply by 2;
	for (int c = 0; c < opencnt; c++) {
		int pos;
		scanf("%d", &pos);
		open[pos] = true;		// setting the posion of frnt brackets to true
	}
	dp[0][0] = 1;
	for (int i = 1; i <= len; i++) {
		for (int j = 1; j <= i; j++) {
			dp[i][j] = dp[i - 1][j - 1];
			if (!open[i]) //if positon false then left = left + up
		    	dp[i][j - 1] += dp[i - 1][j];
		}
	}
	printf("%d\n", dp[len][0]);
}

void solve() {
  int tests;
  scanf("%d", &tests);
  for (int i = 1; i <= tests; i++)
    solve(i);
}
}

int main() {
  SQRBR::solve();
  return 0;
}
