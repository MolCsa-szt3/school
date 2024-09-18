
let adatok = []

function submit(){
    let vanE = true
    let jogsiCheck = document.getElementsByName("jogsi")
    jogsiCheck.forEach(element => {
        if(element.checked) vanE = element.value == "van"
    });

    let temp = {
        vezetek : document.getElementById("vezetek").value,
        kereszt : document.getElementById("kereszt").value,
        kedvSzam : document.getElementById("kedvSzam").value,
        jogsi : vanE
    }
    adatok.push(temp)
    console.log(adatok)

}

function check(vanVagyNincs){
    let tempNames = ""
    adatok.forEach(element => {
        if(vanVagyNincs == element.jogsi){
            tempNames += element.vezetek + " " + element.kereszt + "\n" + "Kedvenc szám: " + element.kedvSzam + "\n\n"
        }
    });
    document.getElementById("nevek").innerText = tempNames
}