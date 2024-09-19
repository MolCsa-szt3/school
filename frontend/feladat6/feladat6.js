let data =  []
let basePath = "https://www.codewars.com/api/v1/users/"
function setIdText(idName, whatTo){
    document.getElementById(idName).innerText = whatTo
}

function check() {
    let path = basePath + document.getElementById("username").value;
    fetch(path)
    .then(x => x.json())
    .then(y => {
        console.log(y);
        setIdText("user","Username: " + y.username)
        setIdText("name", "IRL name: " + y.name)
        setIdText("honor", "Honor: " + y.honor)
        setIdText("kyu",  "Overall rank: " + y.ranks.overall.name)
        let temp = ` <h2>Specific: </h2>`
        let languages = Object.keys(y.ranks.languages)
        for (let i = 0; i < languages.length; i++) {
            const element = languages[i];
            temp += `<div><p>Nyelv: ${element}</p><p>Rank: ${y.ranks.languages[element].name}</p><p>Pontok: ${y.ranks.languages[element].score}</p></div><br>`
        }
        document.getElementById("specific").innerHTML = temp
    })
    document.getElementById("overall").style.display = "block"
    document.getElementById("gomb").style.display = "block"
}
let switcher = 0
function switchStats(){
    
    let buttonText = ["Specific", "Overall"]
    let classSwitch = ["overall","specific"]
    
    document.getElementById(classSwitch[switcher]).style.display = "none"
    switcher = switcher == 0?1:0
    document.getElementById("gomb").value = buttonText[switcher]
    document.getElementById(classSwitch[switcher]).style.display = "block"
}