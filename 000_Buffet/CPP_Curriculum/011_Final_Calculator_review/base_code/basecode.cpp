// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char q,w,e;
	int r,t,y,u,i,o;
	cout<<"Please enter a character: ";
	cin>>q;
	cout<<"Please enter your first integer: ";
	cin>>r;
	cout<<"Please enter a math opperation to perform: ";
	cin>>w;
	cout<<"Please enter your second integer: ";
	cin>>o;
	for(t=0; t<7; t++)
	{
		gotoxy(9,9+t);
		for(y=0; y<20;y++)
		{
			cout<<q;
		}
		cout<<endl;
	}
	for(i=0;i<5; i++){
		gotoxy(10,10+i);
		for(u=0; u<18;u++)
		{
			
			cout<<" ";
		}
	}
	if(w=='-')
	{
		gotoxy(19,12);
		cout<<r;cout<<r-o;
	}
	else if(w=='*')
	{
		gotoxy(19,12);
		cout<<r*o;
	}
	else if(w=='+')
	{
		gotoxy(19,12);
		cout<<r+o;
	}
	else if(w=='/')
	{
		gotoxy(19,12);
		cout<<r/o;
	}
	else
	{
		gotoxy(19,12);
		cout<<"That is not a math symbol. RESTART.";
	}
}