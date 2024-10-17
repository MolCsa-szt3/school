void main(List<String> args) {
  print("fizzBuzz:");
  print(fizzBuzz());

  print("\noddEven:");
  print(oddEven());
  
  print("\noddSet:");
  print(oddSet());

  print("\nfizzBuzzMap:");
  var bigboimap = fizzBuzzMap();
  for (var element in bigboimap.keys) {
    print("${element}: ${bigboimap[element]}");
  }
}

Map<int,List<dynamic>> fizzBuzzMap(){
  Map<int,List<dynamic>> daMap = new Map();
  
  for (var i = 1; i < 101; i++) {
    daMap[i] = [i];
    if(fizzBuzzString(i) != "") daMap[i]?.add(fizzBuzzString(i));
    daMap[i]?.add(oddOrEvenString(i));
  }
  return daMap;
}
String fizzBuzzString(int szam){
  String aeiou = "";
  if(szam % 3 == 0) aeiou += "fizz";
  if(szam % 5 == 0) aeiou += "buzz";
  return aeiou;
}

String oddOrEvenString(int num){
  return num%2==0?"even":"odd";
}

Set<int> oddSet(){
  Set<int> theOdds = new Set();
  for (int num in fizzBuzz()) {
    if(num % 2 != 0) theOdds.add(num);
  }
  return theOdds;
}

List<String> oddEven(){
  List<String> evenOdd = [];
  for (int num in fizzBuzz()) {
    evenOdd.add(oddOrEvenString(num));
  }
  return evenOdd;
}

List<int> fizzBuzz(){
  List<int> fizzbuzznumbers = [];
  for (var i = 1; i < 101; i++) {
    if(i%3==0 ||i%5==0) fizzbuzznumbers.add(i);
  }
  return fizzbuzznumbers;
}
