import 'dart:io';
import 'dart:math';

void feladat1(){
  print("Feladat 1:");
  print("Adjon meg a négyszög egyik oldalának hosszát: ");
  int x = int.parse(stdin.readLineSync()!);
  print("Adjon meg a négyszög másik oldalának hosszát: ");
  int y = int.parse(stdin.readLineSync()!);
  print("A négyszög kissebbik oldala az ${x < y ? x : y} hosszú");
  print("A négyszög nagyobbik oldala az ${x > y ? x : y} hosszú");
  print("A négyszög az egy ${x == y?"négyzet":"téglalap"}.");
  print("A négyszög kerülete az ${2 * ( x + y )}.");
  print("A négyszög területe az ${x * y}.");
}

void feladat2(){
  print("\nFeladat2");
  print("Adjon meg a háromszög egyik oldalának hosszát: ");
  int x = int.parse(stdin.readLineSync()!);
  print("Adjon meg a háromszög másik oldalának hosszát: ");
  int y = int.parse(stdin.readLineSync()!);
  print("Adjon meg a háromszög harmadik oldalának hosszát: ");
  int z = int.parse(stdin.readLineSync()!);

  bool canDo = true;
  List<int> numberCheckerList = [x,y,z,x,y];
  for (var i = 0; i < 3; i++) {
    if(numberCheckerList[i] >= numberCheckerList[i + 1] + numberCheckerList[i + 2]) canDo = false;
  }
  print("A megadott háromszög ${canDo?"":"nem "}létezik.");
}

bool primeCheck(int num){
  for (var i = 2; i < num/2; i++) {
    if(num%i == 0) return false;
  }
  return true;
}

void feladat3(){
  print("\nFeladat3");
  int num = 0;
  do{
    print("Adjon meg egy háromjegyű számot: ");
    num = int.parse(stdin.readLineSync()!);
  }while(num.toString().length != 3);
  int root = sqrt(num).floor();
  print("A szám az ${root * root == num?"":"nem "}egy négyzetszám.");
  print("A szám az ${primeCheck(num)?"":"nem "}egy prímszám.");
}

void feladat4(){
  print("\nFeladat4");
  print("Adjon meg egy számot: ");
  int x = int.parse(stdin.readLineSync()!);
  if(x == 0) throw Exception("Nulla bevitek");
  print("100 / ${x} = ${(100/x).toStringAsFixed(2)}");
}

void main(){
  feladat1();
  feladat2();
  feladat3();
  feladat4();
}