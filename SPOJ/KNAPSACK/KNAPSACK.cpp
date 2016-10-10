/*
http://www.spoj.com/problems/KNAPSACK/

author: mr.prakashnatarajan@gmail.com
date: 6/22/2014
*/
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

namespace knapsack_dp {
int W;
int val[2000]; 
int wt[2000];
//int dp[100][100];

// Returns the maximum value that can be put in a knapsack of capacity W
int knapSack(int W, int wt[], int val[], int n)
{
   int i, w;
   int K[n+1][W+1];
 
   // Build table K[][] in bottom up manner
   for (i = 0; i <= n; i++)
   {
       for (w = 0; w <= W; w++)
       {
           if (i==0 || w==0)
               K[i][w] = 0;
           else if (wt[i-1] <= w)
                 K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
           else
                 K[i][w] = K[i-1][w];
       }
   }
 
   return K[n][W];
}

void solve() {
  int N;
  scanf("%d", &W);  // S as in the prob
  scanf("%d", &N);
  for (int i = 0; i < N; i++) {
    scanf("%d",&wt[i]);
	scanf("%d", &val[i]);
}
printf("%d",knapSack(W,wt,val,N));

}
}

int main() {
  knapsack_dp::solve();
  return 0;
}

