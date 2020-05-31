#include<iostream>
int main()
{
  int n;
 std::cin>>n;
  int sum=0;
  while(n>0 || sum>9)
  {
    if(n == 0)
    {
      n=sum;
    sum=0;
    }
    sum=sum+n%10;
    n/=10;
  }
  std::cout<<sum;

    
  
  return 0;
}