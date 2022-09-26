// For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
// NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371


class Armstrong{
  public boolean isArmstrong(int n){
    int temp = n;
    int sum = 0;
    int rem = 0;
    while(temp != 0){
      rem = temp % 10;
      sum = sum + (rem * rem * rem);
      temp = temp / 10;
    }
    if(sum == n)   return true;
      else    return false;
  }
}
