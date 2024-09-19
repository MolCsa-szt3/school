void main() {
  //0 kő,1 papír, 2 olló 
  int p1 = 2;
  int p2 = 2;
  
  if(p1 == p2) print("Döntetlen");
  else{
    if(p1%2 == p2%2){
      p1 *= -1;
      p2 *= -1;
    }
    if(p1 > p2) print("1. játékos nyert!");
    else print("2. játékos nyert!");
  }
}
