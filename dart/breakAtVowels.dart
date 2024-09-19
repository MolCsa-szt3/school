void main(){
  var txt = "balls";
  for (var i = 0; i < txt.length; i++) {
    print(txt[i]);
    if("aeiou".contains(txt[i])) break;
  }
}
