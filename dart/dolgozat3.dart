import 'dart:io';

void main(List<String> args) {
  feladat1();
  feladat2();
  feladat3();
  feladat4();
}
void feladat1(){
  createFile("players.txt");
  createFile("cars.txt");
}
void createFile(String fileName){
  File createdFile = new File(fileName);
  createdFile.writeAsStringSync("");
  print("File \"${fileName}\" created successfully");
}

void feladat2(){
  deleteFile("players.txt");
}
void deleteFile(String fileName){
  File fileToDelete = File(fileName);
  if(fileToDelete.existsSync()){
    fileToDelete.deleteSync();
    print("File \"${fileName}\" deleted!");
  }
  else print("File \"${fileName}\" not found!");
}
void feladat3(){
  File file = File("Employees.txt");
  if(!file.existsSync()){
    print("File \"Employees.txt\" not found!");
    return;
  }
  List<String> fileLines = file.readAsLinesSync();
  for (var line in fileLines) {
    if (line.contains("female")) print(line);
  }
  for (var line in fileLines) {
    if (line.contains("male") && !line.contains("female")) print(line);
  }
}
void feladat4(){
  File file = File("numbers.txt");
  if(!file.existsSync()){
    print("File \"numbers.txt\" not found!");
    return;
  }
  List<int> numsToAdd =  [8, 0, 5, 1, 3, 2, 11, 19,  1];
  file.writeAsStringSync(numListToRawString(numsToAdd), mode: FileMode.append);

List<String> fileLines = file.readAsLinesSync(); 
List<int> tempIntList = [];
for (var line in fileLines) {
  tempIntList = [];
  for (var numString in line.split(", ")) {
    tempIntList.add(int.parse(numString));
  }
  tempIntList.sort();
  print(numListToRawString(tempIntList));
} 

}
String numListToRawString(List<int> nums){
  String numsString = nums.toString();
  numsString = numsString.substring(1, numsString.length - 1);
  return numsString;
}
