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
    })
}
function switchStats(){
    let buttonText = ["Specific", "Overall"]
    let classSwitch = ["overall","specific"]
    if (getElementById("gomb").value == "Specific") setIdText("gomb", "Overall")
    else setIdText("gomb", "Specific")

}