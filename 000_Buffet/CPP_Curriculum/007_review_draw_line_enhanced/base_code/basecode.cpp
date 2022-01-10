// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int q,e,r,t;
	char w;
	cout<<"Please enter line length : ";
	cin>>q;
	cout<<"Please enter line symbol : ";
	cin>>w;
	cout<<"Please enter line x coordinate : ";
	cin>>r;
	cout<<"Please enter line y coordinate : ";
	cin>>t;
	for(e=0; e<q; e++)
	{
		gotoxy(r+e,t+e);
		cout<<w;
		
	}

}
