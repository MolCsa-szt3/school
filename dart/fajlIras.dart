import 'dart:io';
void main(List<String> args) {
  File file = File('test.txt');
  print(fileRawString(file));
  printLines(fileLineListString(file));
  //first line:
  print(fileNthLine(file, 0));
  //last line:
  print(fileNthLine(file, -1));

  //csv time
  File otherFile = File('test.csv');
  print(fileRawString(otherFile));
  printLines(fileLineListString(otherFile));
  print(fileLineListString(otherFile));
  printDoubleLines(csvDoubleDeckerList(otherFile));
  printSingleColumn(otherFile, "email");
  printColumns(otherFile, ["zipCode", "city"]);
}

void printSingleColumn(File file, String columnName){
  List<List<String>> table2d = csvDoubleDeckerList(file);
  int index = table2d.elementAt(0).indexOf(columnName);
  for (var i = 1; i < table2d.length; i++) {
    print(table2d.elementAt(i).elementAt(index));
  }
}
void printColumns(File file, List<String> columnNames){
  List<List<String>> table2d = csvDoubleDeckerList(file);
  List<int> index = [];
  for (var element in columnNames) {
    index.add(table2d.elementAt(0).indexOf(element));
  }
  for (var i = 1; i < table2d.length; i++) {
    for (var element in index) {
    print(table2d.elementAt(i).elementAt(element)); 
    }
    print("");
  }
}

void printDoubleLines(List<List<String>> list){
  for (var element in list) {
    print(element);
    print("-----------------------------------");
  }
}

List<List<String>> csvDoubleDeckerList(File file){
  List<List<String>> doubleDecker = [];
  List<String> StringLines = fileLineListString(file);
  for (var i = 0; i < StringLines.length; i++) {
    doubleDecker.add(StringLines.elementAt(i).split(', '));
  }
  return doubleDecker;
}




void printLines(List<String> list){
  for (var element in list) {
    print(element);
    print("-----------------------------------");
  }
}
String fileRawString(File file){
  String contents = file.readAsStringSync();
  return contents;
}
List<String> fileLineListString(File file){
  List<String> splitContents =file.readAsLinesSync();
  return splitContents;
}
String fileNthLine(File file, int line){
  if (line >= 0) return fileLineListString(file).elementAt(line);
  List<String> textInLines = fileLineListString(file);
  return textInLines.elementAt(textInLines.length + line);
  //do note, we add it because line here is negative
  //yes, this does mean that 0 will give the 1st line while -1 gives the last, -2 the second to last and so on
}
