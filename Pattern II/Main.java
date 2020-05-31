#include<bits/stdc++.h>
using namespace std;
int main()
{
int n;
  cin>>n;
 // cout<<"1";
  for(int i=0;i<n;i++)
  {
    int x=(i*(i+1)/2)+1;
  //cout<<x;
    if(i%2!=0)
    {
      x=x+i;
      cout<<x;
    for(int j=0;j<i;j++)
    cout<<"*"<<--x;
    }
    else{
      cout<<x;
 	   for(int j=0;j<i;j++)
    cout<<"*"<<++x;
    }
   cout<<endl; 
  }

}