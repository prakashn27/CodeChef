 #include <iostream>
#include <list>
using namespace std;
/*
Sample input
30 500.0 15000.0 3
0 .10
1 .03
3 .002
12 500.0 9999.99 2
0 .05
2 .1
60 2400.0 30000.0 3
0 .2
1 .05
12 .025
-99 0 17000 1


*/

int main() {
	double car_value, borrower_money;
	int result; // borrower money less than car value
	int months, no_of_entries;
	double monthly_pay, total_amount;
	list<int> list_months;
	list<double> list_interests;
	cin >> months;
	while(months > 0) {
		cin >> monthly_pay >> total_amount >> no_of_entries;
		int _month, cur_month;
		double _interest, cur_interest;
		while(no_of_entries-- > 0) {
			cin >> _month;
			list_months.push_back(_month);
			cin >> _interest;
			list_interests.push_back(_interest);
		}
		// cur_month = list_months.front();
		// list_months.pop_front();
		// cur_interest = list_interests.front();
		// list_interests.pop_front();
		cur_month = 0;
		car_value = total_amount;
		borrower_money = total_amount;
		result = 0;
		for(int i = 0; i <= months; i++) {
			//calculate car value;
			if(i > cur_month || i == 0) {
				cur_month = list_months.front();
				list_months.pop_front();
				cur_interest = list_interests.front();
				list_interests.pop_front();
			}
			car_value = car_value * (1 - cur_interest);

			// calculate borrower money;
			borrower_money = borrower_money - monthly_pay;

			if(borrower_money < car_value) {
				result++;
			}
		}
		cout <<  result << endl;

		cin >> months;
	}
}