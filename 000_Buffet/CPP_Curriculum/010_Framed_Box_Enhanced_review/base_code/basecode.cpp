// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char q;
	int w,e,r,t,y,u,i,o;
	cout<<"Please enter border char: ";
	cin>>q;
	cout<<"Please enter the box width: ";
	cin>>w;
	cout<<"Please enter box height: ";
	cin>>e;
	cout<<"Please enter a x coordinate: ";
	cin>>i;
	cout<<"Please enter a y coordinate: ";
	cin>>o;
	for(r=0; r<e; r++)
	{
		gotoxy(i,o+r);
		for(t=0; t<w;t++)
		{
			cout<<q;
		}
		cout<<endl;
	}
	for(y=0;y<e-2; y++){
		gotoxy(i+1,o+1+y);
		for(u=0; u<w-2;u++)
		{
			
			cout<<" ";
		}
	}

}
