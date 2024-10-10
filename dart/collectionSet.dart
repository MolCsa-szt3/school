void main(List<String> args) {
  //1. feladat
  Set<String> week = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Satruday","Sunday"};
  print(week);
  print(week.first);
  print(week.last);
  print(week.isEmpty);
  print(week.isNotEmpty);
  print(week.length);
  print(week.contains("szerda"));
  print(week.contains("Wednesday"));

  //2. feladat
  week.addAll(["workday", "weekend", "holiday", "public holiday", "bank holiday", "national holiday", "religious holiday", "federal holiday", "school holiday", "company holiday", "floating holiday", "seasonal holiday", "observed holiday", "half-day", "flexible day", "personal day", "sick day", "leave of absence", "vacation day", "remote workday"]);
  for (var element in week) {
    print(element);
  }

  //4. feladat
  Set<String> schoolDays = {};
  for (var element in week) {
    if(element.contains("school")) schoolDays.add(element);
  }
  print("Week hoszza: ${week.length}, schoolDays hossza: ${schoolDays.length}");
  print("week és schoolDays különbsége: ${week.difference(schoolDays)}");

  Set<int> indexes = {2,3,7,11,13};
  print("Week set at a few indexes:");
  checkAtIndex(indexes, week);
  print("\nschoolDays set at a few indexes:");
  checkAtIndex(indexes, schoolDays);

}

void checkAtIndex(Set<int> indexes, Set<String> setList){
  for (int index in indexes) {
    try {
      print("${index}: ${setList.elementAt(index)}");
    } catch (e) {
      print("${index}: null");
    }
  }
}
