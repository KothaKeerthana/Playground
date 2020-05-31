#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,fib1=0,fib2=1,fib3;
cin>>n;
if(n==1)
  cout<<fib1;
  else if(n==2)
    cout<<fib2;
  else
  {
  for(int i=0;i<n-2;i++)
  {
  fib3=fib1+fib2;
    //cout<<fib3;
    fib1=fib2;
    fib2=fib3;
  }
    cout<<fib3;
  }
  
}