#include<bits/stdc++.h>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int t=n,a=n,ans=0,c=0;
  while(a>0)
  {
  a=a/10;
  c++;
  }
  while(n>0)
  {
  ans+=pow(n%10,c);
    n=n/10;
  }
   if(ans==t) 
     return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}