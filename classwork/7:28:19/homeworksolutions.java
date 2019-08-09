public class homeworksolutions{
public static void main(String[] args){
  System.out.println(getDistinct(2,4,2));
}
public static int getDistinct(int a, int b, int c){
  int sum = 0;
  if (a != b){
    sum += 1;
  }
  if (a != c){
    sum += 1;
  }
  if (b != c){
    sum += 1;
  }
  else if(sum == 0){
    sum ++;
  }
  if (a == b && b == c ){
    return 1;
  }
  return sum;
  // && <- and
  // || <- means or
}
}
