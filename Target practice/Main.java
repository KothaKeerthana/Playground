#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,sum=0,ele,i=0;
  cin>>n;
  while(sum<n)
  {
  cin>>ele;
    i++;
    sum+=ele;
  }
  cout<<"The number of turns is "<<i;
}