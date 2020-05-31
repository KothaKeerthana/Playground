#include<iostream>
using namespace std;
int main()
{
 int n,c,i,sum=0;
  std::cin>>n>>c;
  int ar[n];
  for(i=0;i<n;i++)
  {std::cin>>ar[i];}
  for(i=0;i<n;i++)
  {sum=sum+ar[i];}
  if(sum<=c)
    std::cout<<"YES";
  else
    std::cout<<"NO";
  return 0;
}