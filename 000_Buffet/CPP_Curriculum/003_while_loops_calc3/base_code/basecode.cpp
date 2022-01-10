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
	int o = 0;
	int p = 1;
	int a = 2;
	while(true)
	{
		cout<<"Enter a number : ";
		cin>>t;
		cout<<"Enter another number : ";
		cin>>y;
		cout<<"Enter a symbol (+,-,*,/) : ";
		cin>>u;
		if (u==q)
		{
			cout<<t+y<<endl;
		}
		else if(u==w)
		{
			cout<<t-y<<endl;
		}
		else if (u==e)
		{
			cout<<t*y<<endl;
		}
		else if (u==r)
		{
			cout<<t/y<<endl;
		}
		else 
		{
			cout<<"Please start again you entered a wrong sign."<<endl;
		}
		cout<<"Would you like to do another equation? (1=Yes or 2=no) ";
		cin>>o;
		if(o==a)
		{
			break;
		}
		
	}

}
