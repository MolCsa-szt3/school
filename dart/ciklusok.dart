void main() {
  //1. feladat
  int intIn1 = 2;
  int intIn2 = 5;

  int min = intIn1 > intIn2 ? intIn2 : intIn1;
  int max = intIn1 < intIn2 ? intIn2 : intIn1;
  if (max < 100) {
    for (int i = min; i <= max; i++) {
      print(i.toString() + (i % 2 == 0 ? " páros" : " páratlan"));
    }
  }

  print("");
  //2. feladat
  List<String> uefa2024euro = [
    "Spain",
    "Germany",
    "Portugal",
    "France",
    "Netherlands",
    "Turkey",
    "England",
    "Switzerland"
  ];
  for (String country in uefa2024euro) {
    print(country);
  }
  print("");
  //3. feladat
  int longth = uefa2024euro.length;
  for (int i = 0; i < longth; i++) {
    for (int j = i + 1; j < longth; j++) {
      print(uefa2024euro[i] + " - " + uefa2024euro[j]);
    }
  }
  
  print("");
  //4. feladat
  
  int intIn3 = 124;
  var numToString = intIn3.toString().split("");
  //print(numToString);
  
  int sum = 0;
  
  for(var hex in numToString){
    //print(hex);
    sum += int.parse(hex);
  }
  print("A számjegyek átlaga: " + (sum / numToString.length).toStringAsFixed(2));
  
  print("");
  //5. feladat
  
  int intIn4 = 346;

  numToString = intIn4.toString().split("");
  for (var hex in numToString) {
    //print(hex);
    print(int.parse(hex) * int.parse(hex));
  }
  
  //6. feladat
  String text = "text";
  List<String> textList = text.split("");
  var maganhangzok = "aeiou".split("");
  for (int i = textList.length - 1; i >= 0; i--) {
    if (maganhangzok.contains(textList[i])) {
      textList.removeAt(i);
    }
  }
  String textAfter = "";
  for (String betu in textList) {
    textAfter += betu;
  }
  print(textAfter);
  
  print("");
  //7. feladat
  text = "text";
  for (String betu in text.split("")){
    print(betu + ", " + betu.runes.toString());
  }
}
