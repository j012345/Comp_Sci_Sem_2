// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
 char q;
 int w,e,r;
 cout<<"What do you want your snowflake to look like? ";
 cin>>q;
 while(true)
 {
 	w=w+1;
 	gotoxy(3,3+w);
 	cout<<"*"<<endl;
 	sleep(1);
 	gotoxy(3,3+w);
 	cout<<" "<<endl;
 }
 while(true)
 {
 	e=e+1;
 	gotoxy(6,5+e);
 	cout<<q<<endl;
 	sleep(1);
 	gotoxy(6,5+e);
 	cout<<" "<<endl;
 }
while(true)
 {
 	r=r+1;
 	gotoxy(3,8+r);
 	cout<<q<<endl;
 	sleep(1);
 	gotoxy(3,8+r);
 	cout<<" "<<endl;
 }
 
}
