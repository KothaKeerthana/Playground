#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,a,b,c;
  a=121;
  b=11;
  cin>>n;
  if(n==1)
    cout<<"121"<<" ";
  else
  {
  cout<<"121"<<" ";
    for(int i=2;i<=n;i++)
    {
    b=b+4;
      c=b*b;
      cout<<c<<" ";
    }
  }
}