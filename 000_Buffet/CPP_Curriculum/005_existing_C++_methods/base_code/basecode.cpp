// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char q;
	int w,y;
	char t; 
	cout<<"What symbol would you like to use? ";
	cin>>q;
	cout<<"How many symbols do you want? ";
	cin>>w;
	cout<<"Horizontal=h or Vertical=v or Diagonal=d? ";
	cin>>t;
	if(t == 'h')
	{
		for(y=0;y<w;y++)
		{
			cout<<q;
		}
	}
	else if(t=='v')
	{
		for(y=0;y<w;y++)
		{
			cout<<q<<endl;
		}
	}
	else if(t=='d')
	{
		cout<<""<<endl;
		cout<<""<<endl;
		cout<<""<<endl;
		cout<<""<<endl;
		cout<<""<<endl;
		for(y=0;y<w;y++)
		{
			
			gotoxy(1+y,2+y);
			cout<<q<<endl;
		}
	}
}
