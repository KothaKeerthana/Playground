#include<iostream>
int gcd(int a,int b)
{
  if(b == 0)
    return a;
  return gcd(b,a%b);
}

int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<< b<< " = "<<gcd(a,b);
  return 0;
  
}