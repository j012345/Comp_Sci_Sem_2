// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char q = '+';
	char w = '-';
	char e = '*';
	char r = '/';
	int t,y = 0;
	char u = 0;
	cout<<"Enter a number : ";
	cin>>t;
	cout<<"Enter another number : ";
	cin>>y;
	cout<<"Enter a symbol (+,-,*,/) : ";
	cin>>u;
	if (u==q)
	{
		cout<<t+y;
	}
	else if(u==w)
	{
		cout<<t-y;
	}
	else if (u==e)
	{
		cout<<t*y;
	}
	else if (u==r)
	{
		cout<<t/y;
	}
	else 
	{
		cout<<"Please start again you entered a wrong sign.";
	}
}
