#include<iostream>
using namespace std;
int queue(int n,int m,int a[])
{
  int sum=0;
  for(int i=0;i<n;i++)
  {sum+=a[i];}
  if(n==1 && m==2)
  return 1;
    else
      return (sum/m)+1;
}
int main()
{
 int n,m;
  std::cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
  {std::cin>>a[i];}
    std::cout<<queue(n,m,a);
}