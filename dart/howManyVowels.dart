void main(){
  var txt = "balls lmao";
  int counter = 0;
  for (var i = 0; i < txt.length; i++) {
    if("aeiou".contains(txt[i])) counter++;
  }
  print("There are ${counter} vowels in the word(s) \"${txt}\"");
}
