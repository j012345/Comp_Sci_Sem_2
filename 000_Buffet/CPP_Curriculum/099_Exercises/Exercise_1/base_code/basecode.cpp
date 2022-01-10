// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int q = 5;
	int w = 25;
	int e = 15;
	int r = q+1;
	int t = 5;
	while(true)
	{
		cout<<q<<endl;
		if(q==w)
		{
			break;
		}
		q=q+1;
	}
	while(true)
	{
		cout<<e<<endl;
		if(e==t)
		{
			break;
		}
		e=e-1;
	}
	for(int i =5; i <= 25; i = i+1){
		cout<<i<<endl;
	}
	for(int o =15; o>=5; o=o-1){
		cout<<o<<endl;
	}
}
