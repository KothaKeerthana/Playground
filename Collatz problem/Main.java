#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,k=0;
  cin>>n;
  cout<<n<<endl;
  while(n>1)
  {
  if(n%2==0)
  {
    cout<<n/2<<endl;
    n=n/2;
  }
    else
    {
    cout<<3*n+1<<endl;
      n=3*n+1;
    }
    k++;
  }
  cout<<k;
}