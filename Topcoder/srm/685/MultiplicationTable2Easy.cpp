#include <iostream>
#include <vector>
#include <math.h>
#include <algorithm>
using namespace std;

class MultiplicationTable2Easy {
public:
    std::string isGoodSet(vector<int> table, vector<int> t) {
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
