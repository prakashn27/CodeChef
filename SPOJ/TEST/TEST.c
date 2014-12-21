/*
SPOJ Problem Set (classical)
1. Life, the Universe, and Everything
Problem code: TEST

Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Example

Input:
1
2
88
42
99

Output:
1
2
88
*/
#include<stdio.h>
#include<stdlib.h>
// using linked list
struct node;
typedef struct node *pnode;
struct node{
	int no;
	pnode next;
	};
typedef struct //node *declarenode;
{
	struct node *head;
	int size;
}seqlist;
	
int main()
{
	pnode present = NULL;
	pnode prev = NULL;
	int m=0;
	seqlist numberlist;
	numberlist.head = NULL;
	numberlist.size = 0;
	//prev = (pnode)malloc(sizeof(struct node));
	while(m!=42)
	{
		scanf("%d",&m);
		present = (pnode)malloc(sizeof(struct node));
		present->no = m;
		if(numberlist.head == NULL)
		{
			numberlist.head=present;
			prev = present;
			numberlist.size++;
		}
		else
		{
			prev->next = present;
			prev = present;
			numberlist.size++;	
		}
	}
	for(present = numberlist.head;numberlist.size >1; numberlist.size--)
	{
		printf("%d \n", present->no);
		prev = present;
		present = present->next;
		free(prev);
	}
	return 0;
}
