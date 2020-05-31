#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,os=0,es=0,i=0;
  cin>>n;
  while(n)
  {
  if(i%2==0)
    os+=n%10;
    else
      es+=n%10;
  n=n/10;
    i++;
  }
  if(os==es)
    cout<<"Yes";
  else
    cout<<"No";
}