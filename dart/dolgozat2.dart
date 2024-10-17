
import 'dart:io';
import 'dart:math';
void main(List<String> args) {
  printFeladat(1);
  String name = getName();
  welcome(name);

  printFeladat(2);
  print(getRandomNumber(10,50));

  printFeladat(3);
  print("on working numbers(2,3): ${getPower(2, 3)}");
  //print("on bad numbers: ${getPower(-2, 2.3)}");

  printFeladat(4);
  print("is 9 a prime? ${isPrime(9)}");
  print("is 10 a prime? ${isPrime(10)}");
  print("is 11 a prime? ${isPrime(11)}");

  printFeladat(5);
  print(halfwayPoint([3,4,5], [-1,-4,12]));

  printFeladat(6);
  print(rotateBy90([[1,2,3],[4,5,6],[7,8,9]]));
}

List<List<int>> rotateBy90 (List<List<int>> based){
  List<int> uno = based.elementAt(0);
  List<int> dos = based.elementAt(1);
  List<int> tres = based.elementAt(2);
  
  return [
    [tres.elementAt(0), dos.elementAt(0), uno.elementAt(0)],
    [tres.elementAt(1), dos.elementAt(1), uno.elementAt(1)],
    [tres.elementAt(2), dos.elementAt(2), uno.elementAt(2)]
  ];
}

List<num> halfwayPoint(List<num> point1, List<num> point2){
  return [(point1.elementAt(0) + point2.elementAt(0)) / 2,(point1.elementAt(1) + point2.elementAt(1)) / 2,(point1.elementAt(2) + point2.elementAt(2)) / 2];
}

bool isPrime(int number){
  for (var i = 2; i < number / 2; i++) {
    if(number % i == 0) return false;
  }
  return true;
}

num getPower(num base, num exponent){
  if(base.isNegative && exponent.toInt() != exponent) throw Exception("Imaginary number");
  return pow(base, exponent);
}

int getRandomNumber(int min, int inclMax){
  Random rng = new Random();
  return rng.nextInt(inclMax - min + 1) + min;
}

void printFeladat(int melyik){
  print("\n${melyik}. Feladat:");
}

String getName(){
  print("Please write your name:");
  String? input = stdin.readLineSync();
  return input is Null?"":input;
}
void welcome(String name){
  print("Hello ${name}");
}
