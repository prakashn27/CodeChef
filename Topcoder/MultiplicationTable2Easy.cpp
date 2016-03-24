/*
// PROBLEM STATEMENT
// Fox Ciel is creating a new binary operation.

The operation will be denoted $ and it will be defined on the finite set S = {0, 1, 2, ..., n-1}.
I.e., for each ordered pair (i, j) of elements of S the operation (i $ j) will return some element of S.

For example, we can have S = {0, 1}, and we can define that (0 $ 0) = 0, (0 $ 1) = 1, (1 $ 0) = 0, and (1 $ 1) = 0.

Note that Ciel's operation is not necessarily symmetric.
In other words, it is possible that for some i and j the operations (i $ j) and (j $ i) return two different values.

A nice concise description of the operation $ is its "multiplication table": a square table where in row i and column j we have the value (i $ j).
You are given this "multiplication table" encoded as a vector <int> table with n^2 elements.
For each valid i and j the operation (i $ j) returns the value table[i*n+j].

A subset T of S is called good if it has the following property:
for any two elements i and j in T, (i $ j) is also in T.

You are given a vector <int> t.
The elements of t form a subset of the set S.
Return "Good" (quotes for clarity) if this subset is good.
Otherwise, return "Not Good".
Note that the return value is case-sensitive.

DEFINITION
Class:MultiplicationTable2Easy
Method:isGoodSet
Parameters:vector <int>, vector <int>
Returns:string
Method signature:string isGoodSet(vector <int> table, vector <int> t)


NOTES
-You are not given the value of n explicitly. Instead, you can determine it as the square root of the number of elements in table.


CONSTRAINTS
-n will be between 2 and 50, inclusive.
-table will contain exactly n*n elements.
-Each element in table will be between 0 and n-1, inclusive.
-t will contain between 1 and n elements, inclusive.
-Each element in t will be between 0 and n-1, inclusive.
-Elements in t will be distinct.


EXAMPLES

0)
{1, 1, 2, 3,
 1, 0, 2, 3,
 3, 3, 0, 3,
 2, 2, 2, 0}

{1,0}

Returns: "Good"

We can verify:

0 $ 0 = 1
0 $ 1 = 1
1 $ 0 = 1
1 $ 1 = 0


1)
{1, 1, 2, 3,
 1, 0, 2, 3,
 3, 3, 0, 3,
 2, 2, 2, 0}
{2, 3}

Returns: "Not Good"

Note that: 2 $ 2 = 0 but 0 is not in T, so it is not good.

2)
{1, 1, 2, 3,
 1, 0, 2, 3,
 3, 3, 0, 3,
 2, 2, 2, 0}

{0,1,2,3}

Returns: "Good"



3)
{1, 1, 2, 3,
 1, 0, 2, 3,
 3, 3, 0, 3,
 2, 2, 2, 0}

{1}

Returns: "Not Good"



4)
{2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2}
{2,4,5}

Returns: "Good"



5)
{2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2,
 2,2,2,2,2,2}
{0,1,3,4,5}

Returns: "Not Good"



*/
#line 130 "MultiplicationTable2Easy.cpp"
#include <string>
#include <vector>
#include <math.h>
class MultiplicationTable2Easy {
	public:
        std::string isGoodSet(std::vector<int> table, std::vector <int> t) {
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

#include <ctime>
#include <cmath>
#include <string>
#include <vector>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;

int main(int argc, char* argv[])
{
	if (argc == 1) 
	{
		cout << "Testing MultiplicationTable2Easy (250.0 points)" << endl << endl;
		for (int i = 0; i < 20; i++)
		{
			ostringstream s; s << argv[0] << " " << i;
			int exitCode = system(s.str().c_str());
			if (exitCode)
				cout << "#" << i << ": Runtime Error" << endl;
		}
		int T = time(NULL)-1458792503;
		double PT = T/60.0, TT = 75.0;
		cout.setf(ios::fixed,ios::floatfield);
		cout.precision(2);
		cout << endl;
		cout << "Time  : " << T/60 << " minutes " << T%60 << " secs" << endl;
		cout << "Score : " << 250.0*(.3+(.7*TT*TT)/(10.0*PT*PT+TT*TT)) << " points" << endl;
	}
	else
	{
		int _tc; istringstream(argv[1]) >> _tc;
		MultiplicationTable2Easy _obj;
		string _expected, _received;
		time_t _start = clock();
		switch (_tc)
		{
			case 0:
			{
				int table[] = {1, 1, 2, 3,
				               1, 0, 2, 3,
				               3, 3, 0, 3,
				               2, 2, 2, 0};
				int t[] = {1,0};
				_expected = "Good";
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}
			case 1:
			{
				int table[] = {1, 1, 2, 3,
				               1, 0, 2, 3,
				               3, 3, 0, 3,
				               2, 2, 2, 0};
				int t[] = {2, 3};
				_expected = "Not Good";
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}
			case 2:
			{
				int table[] = {1, 1, 2, 3,
				               1, 0, 2, 3,
				               3, 3, 0, 3,
				               2, 2, 2, 0};
				int t[] = {0,1,2,3};
				_expected = "Good";
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}
			case 3:
			{
				int table[] = {1, 1, 2, 3,
				               1, 0, 2, 3,
				               3, 3, 0, 3,
				               2, 2, 2, 0};
				int t[] = {1};
				_expected = "Not Good";
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}
			case 4:
			{
				int table[] = {2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2};
				int t[] = {2,4,5};
				_expected = "Good";
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}
			case 5:
			{
				int table[] = {2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2,
				               2,2,2,2,2,2};
				int t[] = {0,1,3,4,5};
				_expected = "Not Good";
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}
			/*case 6:
			{
				int table[] = ;
				int t[] = ;
				_expected = ;
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}*/
			/*case 7:
			{
				int table[] = ;
				int t[] = ;
				_expected = ;
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}*/
			/*case 8:
			{
				int table[] = ;
				int t[] = ;
				_expected = ;
				_received = _obj.isGoodSet(vector <int>(table, table+sizeof(table)/sizeof(int)), vector <int>(t, t+sizeof(t)/sizeof(int))); break;
			}*/
			default: return 0;
		}
		cout.setf(ios::fixed,ios::floatfield);
		cout.precision(2);
		double _elapsed = (double)(clock()-_start)/CLOCKS_PER_SEC;
		if (_received == _expected)
			cout << "#" << _tc << ": Passed (" << _elapsed << " secs)" << endl;
		else
		{
			cout << "#" << _tc << ": Failed (" << _elapsed << " secs)" << endl;
			cout << "           Expected: " << "\"" << _expected << "\"" << endl;
			cout << "           Received: " << "\"" << _received << "\"" << endl;
		}
	}
}

