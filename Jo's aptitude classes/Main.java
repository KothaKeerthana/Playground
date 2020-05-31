#include <bits/stdc++.h> 
using namespace std; 
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to find gcd of array of 
// numbers 
int findGCD(int arr[], int n) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < n; i++) 
    { 
        result = gcd(arr[i], result); 
  
        if(result == 1) 
        { 
           return 1; 
        } 
    } 
    return result; 
} 
  
// Driver code 
int main() 
{ 
    int a[3];
  int ans;
  cin>>a[0]>>a[1]>>a[2];
  cin>>ans;
    int n = 3; 
    int x= findGCD(a, n);
  if(x==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
    return 0; 
} 
