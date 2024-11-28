class Man{
  String? name;
  int age = 0;
  bool man = false;

  Man(this.name, [this.age = 0, this.man = false]);

  void printData(){
    print("${this.name}, age: ${this.age}, is ${this.man? "male": "female"}");
  }
}
class Camera{
  String model = "";
  int storageInMb = 0;
  int resolutionInMpx = 0;

  Camera(this.model, this.storageInMb, this.resolutionInMpx);
  void display(){print("camera: ${model} with ${storageInMb}mb storage and ${resolutionInMpx}Mpx resolution");}
}
class Home{
  String? street;
  int? streetNum;
  String? type;

  Home(this.street, this.streetNum, this.type);
  void display(){print("The ${type} type home is on ${street} street ${streetNum}");}
}

void main(List<String> args) {
  Camera cam1 = Camera("Deez", 1234, 69);
  Camera cam2 = Camera("Vampiric Nikon", 2098, 420);
  cam1.display();
  cam2.display();
  Home haus = Home("This", 9, "apartment");
  haus.display();
}
