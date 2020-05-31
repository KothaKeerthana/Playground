#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,ele,flag=1;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>ele;
  for(int i=0;i<n;i++)
    if(a[i]==ele)
    {flag=0;
     break;
    }
if(flag==0)
  cout<<"She passed her exam";
  else
    cout<<"She failed";
}