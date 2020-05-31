#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,a=6,k=0,c=8;
  cin>>n;
  if(n==1)
    cout<<"0";
    else if(n==2)
    cout<<"0 2";
  else 
  {
  cout<<"0 2 8 ";
    for(int i=0;i<n-3;i++)
    {
       // cout<<i<<"%"<<endl;
    if(k<1)
    {
    c=c+a;
      cout<<c<<" ";
      k++;
    }
      else
      {
        k=0;
        a=a+4;
        c=c+a;
        cout<<c<<" ";
      }
    }
  }
}