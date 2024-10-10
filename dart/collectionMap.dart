import 'dart:math';

void main(List<String> args) {
  Map<String,List<String>> weekMap = {};
  Set<String> week = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Satruday","Sunday"};
  Set<String> weekWithExtras = {};
  weekWithExtras.addAll(week);
  weekWithExtras.addAll(["workday", "weekend", "holiday", "public holiday", "bank holiday", "national holiday", "religious holiday", "federal holiday", "school holiday", "company holiday", "floating holiday", "seasonal holiday", "observed holiday", "half-day", "flexible day", "personal day", "sick day", "leave of absence", "vacation day", "remote workday"]);
  Random rng = new Random();
  int rollingIndex = 0;
  for (var i = 0; i < week.length; i++) {
    weekMap[week.elementAt(i)] = [];
    for (var j = 0; j < rng.nextInt(5); j++) {
      weekMap[week.elementAt(i)]?.add(weekWithExtras.elementAt(rollingIndex++));
    }
  }
  //okay it is done
  //print(weekMap);

  print(weekMap.keys);
  weekMap.forEach((key,value)=>print("${key}: ${value}(${value.length}pcs)"));

  weekMap["Wednesday"] =  ["workday", "remote workday", "national holiday"];
  weekMap["Satruday"] = [];
  print("Post-processing:");
  weekMap.removeWhere((key,value)=>value.length == 0);
  weekMap.forEach((key,value)=>print("${key}: ${value}"));
}
