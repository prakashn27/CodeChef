/*
Input and Output

Input will consist of several lines of text containing an even number of double-quote (") characters. Input is ended with an end-of-file character. The text must be output exactly as it was input except that:

the first " in each pair is replaced by two ` characters: `` and
the second " in each pair is replaced by two ' characters: ''.
Sample Input

"To be or not to be," quoth the Bard, "that
is the question".
The programming contestant replied: "I must disagree.
To `C' or not to `C', that is The Question!"
Sample Output

``To be or not to be,'' quoth the Bard, ``that
is the question''.
The programming contestant replied: ``I must disagree.
*/

#include<iostream>

using namespace std;

int main(){

    char c;
    bool front=1;
    while(scanf("%c", &c) != EOF) {
    	if(c == '"') {
    		if(front) {
    			printf("``");
    		} else {
    			printf("''");
    		}
    		front = !front;
    	} else {
    		printf("%c", c);
    	}
    }
    return 0;
}