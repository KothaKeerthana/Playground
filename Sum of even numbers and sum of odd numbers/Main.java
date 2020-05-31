#include<bits/stdc++.h>
using namespace std;
int main()
{
int n,os=0,es=0,ele;
  cin>>n;
  for(int i=0;i<n;i++)
  {
  cin>>ele;
    if(ele%2==0)
      es+=ele;
    else
      os+=ele;
  }
  cout<<"The sum of the even numbers in the array is "<<es<<endl<<"The sum of the odd numbers in the array is "<<os;

}