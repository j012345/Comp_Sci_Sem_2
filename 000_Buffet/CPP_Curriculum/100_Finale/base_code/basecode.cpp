// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int q,r,w,e,t,y,u,i,o,p;
	cout<<"How big do you want your present to be? ";
	cin>>q;
	for(r=0; r<q; r++)
	{
		gotoxy(15,4+r);
		for(t=0; t<q;t++)
		{
			cout<<"@";
		}
		cout<<endl;
	}
	for(y=0;y<q-2; y++){
		gotoxy(16,5+y);
		for(u=0; u<q-2;u++)
		{
			
			cout<<" ";
		}
	}	
	gotoxy(5,4);
	cout<<"^";
	gotoxy(4,5);
	cout<<"< > ";
	gotoxy(3,6);
	cout<<"<   >";
	gotoxy(2,7);
	cout<<"<     >";
	gotoxy(3,8);
	cout<<" | |";
	while(true)
    {
    	e=e+1;
 	gotoxy(7,3+e);
 	cout<<"*"<<endl;
 	sleep(1);
 	gotoxy(7,3+e);
 	cout<<" "<<endl;
    while(true){
 	w=w+1;
 	gotoxy(3,3+w);
 	cout<<"*"<<endl;
 	sleep(1);
 	gotoxy(3,3+w);
 	cout<<" "<<endl;
    }
    
	
}
}
