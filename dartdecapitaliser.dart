void main() {
  String str ="AeIoU";
  String strUncapped = "";
  for (int i = 0; i < str.length; i++) {
    var betu = str[i];
    if (betu == betu.toLowerCase()) strUncapped += betu;
  }
  print(strUncapped);
}
