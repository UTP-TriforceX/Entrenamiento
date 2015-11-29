//1107 - How Cow

#include <bits/stdc++.h>

using namespace std;

int main(){
    int x1,y1,x2,y2,x,y,m,i,j,t;
   
    cin>>t; 
   
    if(t<=50){
       for(i=1;i<=t;i++){
            cin>>x1>>y1>>x2>>y2;
            cin>>m;
            cout<<"Case "<<i<<":\n";
           
            for(j=1;j<=m;j++){
                cin>>x>>y;
               
                if((x>x1)&&(x<x2)&&(y>y1)&&(y<y2)){
                    cout<<"Yes\n";
                }
                else{
                    cout<<"No\n";
                }
            }  
       }
    }
    return 0;
}