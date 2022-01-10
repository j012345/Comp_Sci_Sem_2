// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char q;
	int w,t,y;
	int e = 1;
	int r = 2;
	cout<<"What symbol would you like to use? ";
	cin>>q;
	cout<<"How many symbols do you want? ";
	cin>>w;
	cout<<"Horizontal=1 or Vertical=2? ";
	cin>>t;
	if(t==1)
	{
		for(y=0;y<w;y++)
		{
			cout<<q;
		}
	}
	else if(t==2)
	{
		for(y=0;y<w;y++)
		{
			cout<<q<<endl;
		}
	}
	
}
