#include<bits/stdc++.h>
using namespace std;
int main()
{
int m,n,req;
  cin>>m>>n>>req;
  int ans=pow(m,n);
  if(ans>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}