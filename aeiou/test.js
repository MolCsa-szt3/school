const coursesURL = "https://vvri.pythonanywhere.com/api/courses";
const studentsURL = "https://vvri.pythonanywhere.com/api/students"
var storedData = null;
fetch(coursesURL)
.then(response => response.json())
.then(data => {
if (data)
storedData = data
data.forEach(element => {
    console.log(element)
    //document.getElementById("names").innerText += element.name + "\n"
    document.getElementById("kurzusok").innerHTML += `<option value="${element.id}">${element.name} (id:${element.id})</option>`
})

console.log(storedData)
})
.catch(error => console.log("Hiba történt: " + error))



function change(){
    let diakLista = document.getElementById("diakokLista")
    document.getElementById("diakok").style.display = "block"
    let index = document.getElementById("kurzusok").options.selectedIndex
    //console.log(`index=${index},  `)
    let temp = ``
    let element = storedData[index];
    //console.log(element.name)
            element.students.forEach(diak => {
                temp +=`<li>${diak.name} (id: ${diak.id})</li>`
            })
            diakLista.innerHTML = temp
    
}
function showAll(){
    if(document.getElementById("changer").style.display != "block")
        document.getElementById("changer").style.display = "block"
    else document.getElementById("changer").style.display = "none"
}
function show(which){
    let kurzusok = ["add", "change", "del"]
    kurzusok.forEach(element => {
        document.getElementById(element).style.display = "none"
    });
    document.getElementById(which).style.display = "block"
}

function refresh(){
    fetch(coursesURL)
    .then(response => response.json())
    .then(data => {
    if (data)
    storedData = data
    document.getElementById("kurzusok").innerHTML = ""
    data.forEach(element => {
        //console.log(element)
        //document.getElementById("names").innerText += element.name + "\n"
        document.getElementById("kurzusok").innerHTML += `<option value="${element.id}">${element.name} (id:${element.id})</option>`
    })

    console.log(storedData)
    change()
    })
    .catch(error => console.log("Hiba történt: " + error))
}

function AddCourse(){
    let courseName = document.getElementById("addText").value
    if(courseName != ""){
        fetch(coursesURL,{
            method: "POST",
            body: JSON.stringify({
                name: courseName
            }),
            headers: { 
                "Content-type": "application/json; charset=UTF-8"
            } 
        })
        .then(response => {
            if (response.ok) {
                refresh()
                return response.json()
                }
                // Ha a válasz státusza nem OK, akkor dobunk egy hibát
                throw new Error('Network response was not ok.');
        }) 
    }
    
}
function AddStudent(){
    let studentName = document.getElementById("addText").value
    let courseID = document.getElementById("addID").value
    if(studentName != "" && courseID != ""){
        fetch(studentsURL,{
            method: "POST",
            body: JSON.stringify({
                name: studentName,
                course_id: courseID
            }),
            headers: { 
                "Content-type": "application/json; charset=UTF-8"
            } 
        })
        .then(response => {
            if (response.ok) {
                refresh()
                return response.json()
                }
                // Ha a válasz státusza nem OK, akkor dobunk egy hibát
                throw new Error('Network response was not ok.');
        }) 
    }
    
}

function DelCourse(){
    let courseID = document.getElementById("delID").value
    if(courseID != ""){
        fetch(coursesURL + "/" + courseID,{
            method: "DELETE",
            headers: { 
                "Content-type": "application/json; charset=UTF-8"
            } 
        })
        .then(response => {
            if (response.ok) {
                refresh()
                return response.json()
                }
                // Ha a válasz státusza nem OK, akkor dobunk egy hibát
                throw new Error('Network response was not ok.');
        })
    }
    
}
function DelStudent(){
    let courseID = document.getElementById("delID").value
    if(courseID != ""){
        fetch(studentsURL + "/" + courseID,{
            method: "DELETE",
            headers: { 
                "Content-type": "application/json; charset=UTF-8"
            } 
        })
        .then(response => {
            if (response.ok) {
                refresh()
                return response.json()
                }
                // Ha a válasz státusza nem OK, akkor dobunk egy hibát
                throw new Error('Network response was not ok.');
        })
    }

}

