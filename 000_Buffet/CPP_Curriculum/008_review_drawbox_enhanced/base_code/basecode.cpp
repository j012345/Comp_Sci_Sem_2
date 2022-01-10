// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char q;
	int w,e,r,t,y,u;
	cout<<"Please enter border char: ";
	cin>>q;
	cout<<"Please enter the box width: ";
	cin>>w;
	cout<<"Please enter box height: ";
	cin>>e;
	cout<<"Please enter box x coordinate : ";
	cin>>y;
	cout<<"Please enter box y coordinate : ";
	cin>>u;

	for(r=0; r<e; r++)
	{
		gotoxy(y,u+r);
		for(t=0; t<w;t++)
		{	
			cout<<q;
		}
		cout<<endl;
	}

}
