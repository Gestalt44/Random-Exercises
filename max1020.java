//Given 2 positive int values,
//return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

public int max1020(int a, int b)
{
  boolean a_inrange=false,b_inrange=false;
  if(10<=a && a<=20) 
  a_inrange=true;
  if (10<=b && b<=20)
  b_inrange=true;
  boolean condition=a_inrange && b_inrange;
  if(condition)
  return a>b ? a:b;
  else if(a_inrange)
  return a;
  else if (b_inrange)
  return b;
  else
  return 0;
  
}
