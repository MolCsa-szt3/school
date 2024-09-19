void main() {
  int num = 423;
  int count = 0;
  int sum = 0;
  for(int i = 0; i < num.toString().length;i++){
    int uno = int.parse(num.toString()[i]);
    
    sum += uno;
    count++;
  }
  print((count/sum).toStringAsFixed(2));
}
