/*Input

There is a single positive integer T on the first line of input (equal to about 100000). It stands for the number of numbers to follow. Then there are T lines, each containing exactly one positive integer number N, 1 <= N <= 1000000000.

Output

For every number N, output a single line containing the single non-negative integer Z(N).
Example

Sample Input:

6
3
60
100
1024
23456
8735373

Sample Output:

0
14
24
253
5861
2183837
*/
#include<stdio.h>
#include<math.h>
int main()
{
	long long int d1=5,d2=25,d3=125,d4=625,d5=3125, d6=15625,
 	d7=78125,d8=390625,d9=1953125,d10=9765625,d11=48828125,d12=244140625,x;
	int t,n,k,i=0,j=0;
	scanf("%d",&t);
	n=t;
	if(t<100000)
	{
		int a[t],z[t];
		while(t--)
		{
			scanf("%d",&a[i]);
			i++;
		}
		while(n--)
		{
			x = a[j]; 
			j++;
			if(x<5) z[j]=0;
			else if(x>=d1 && x<d2)
			{
				z[j]=x/d1;
			}
			else if(x>=d2 && x<d3)
			{
				z[j]=x/d1+x/d2;
			}
			else if(x>=d3 && x<d4)
			{
				z[j]=x/d1+x/d2+x/d3;
			}
			else if(x>=d4 && x<d5)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4;
			}
			else if(x>=d5 && x<d6)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5;
			}
			else if(x>=d6 && x<d7)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6;
			}
			else if(x>=d7 && x<d8)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6+x/d7;
			}
			else if(x>=d8 && x<d9)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6+x/d7+x/d8;
			}
			else if(x>=d9 && x<d10)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6+x/d7+x/d8+x/d9;
			}
			else if(x>=d10 && x<d11)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6+x/d7+x/d8+x/d9+x/d10;
			}
			else if(x>=d11 && x<d12)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6+x/d7+x/d8+x/d9+x/d10+x/d11;
			}
			else if(x>=d12 && x<1000000000)
			{
				z[j]=x/d1+x/d2+x/d3+x/d4+x/d5+x/d6+x/d7+x/d8+x/d9+x/d10+x/d11+x/d12;
			}

		}
		for(k=1;k<=j;k++) printf("%d \n",z[k]);
		
	}
	return 0;
}
