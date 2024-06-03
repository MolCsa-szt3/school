import flet as ft

points = [0,0] #curr/max

def vibeCheck(answer, correct):
    points[1] += 1
    if answer == correct:
        points[0] += 1

def vibeMultiCheck(answer, corrects):
    points[1] += 1
    if answer in corrects:
        points[0] += 1


genders = ["háromszög","négyszög", "ötszög"]
def main(page: ft.Page):
    
    page.title = 'Quiz Projekt'
    page.scroll = ft.ScrollMode.AUTO
    #yes, this is the forms project being rebastardised into the quiz one since it's basically all the things but check if correct or not

    nev = ft.TextField(label="Név")
    
    
    def slider_changed(e):
        nem.value = f"{genders[int(e.control.value)]}"
        page.update()
    nem = ft.Text("háromszög")
    
    
    droppu = ft.Dropdown(
        options=[
            ft.dropdown.Option("Nincs sapkálya"),
            ft.dropdown.Option("Van 1 sapkája"),
            ft.dropdown.Option("Van 1 zöld sapkája"),
            ft.dropdown.Option("Semelyik sapkálya sem zöld"),
        ],
        value= "Nincs sapkálya"
    )
    

    radio = ft.RadioGroup(
        content=ft.Column([
            ft.Radio(value="nay", label="3"),
            ft.Radio(value="yay", label="6"),
            ft.Radio(value="neigh", label="8")
        ]),
        value="neigh"

    )

    c1 = ft.Checkbox(label="NES")
    c2 = ft.Checkbox(label="SNES")
    c3 = ft.Checkbox("Xbox")
    c4 = ft.Checkbox("Xbox360")
    checkbawx = ft.Column(
        [c1,c2,c3,c4]
    )

    def weapon_switch(e):
        weaponswitch.label = "Gunner" if weaponswitch.value else "Swordmaster"
        page.update()
        
    weaponswitch = ft.Switch(
        label="Swordmaster", on_change=weapon_switch,
    )

    
    def check_things(e):
        vibeCheck(nem.value, "háromszög")
        vibeCheck(droppu.value,"Van 1 sapkája")
        vibeCheck(radio.value, "yay")
        vibeCheck(weaponswitch.label,"Swordmaster")
        vibeCheck([c1.value, c2.value,c3.value,c4.value], [True, False, False, True])
        # TODO: add more
        textbawx.value = f"Pontok: {points[0]}/{points[1]}"
        page.update()


    textbawx = ft.Text(
        value=""
    )

    check = ft.TextButton(
        width=100,
        text="Send",
        on_click=check_things
    )

    

    col = ft.Column(
        [
        nev,
        ft.Text("Melyik alakzatnak ugyananny a belső és külső szögeinek összege?") ,nem, ft.Slider(min=0, max=2, divisions=2, on_change=slider_changed, width=100),
        ft.Text("Pinokkió minding (matematikaileg) hazudik.\nPinokkió azt állítja, hogy minden sapkája zöld\nEzen állítások közül melyik igaz?"), droppu,
        ft.Text('Mennyi különféle konzol tartozik a "3DS" konzolcsaládba?'), radio,
        ft.Text("Monster Hunter-ben a Gunlance melyik fegyver csoportba tartozik?"),weaponswitch,
        ft.Text('Melyik konzolokon lehet a "Pac-Man Championship Edition"-t játszani?'),checkbawx,
        check, textbawx
        ],
        alignment= ft.alignment.center,
        width=300

    )
    BigBoiBox = ft.Container(
        content=col,
        alignment= ft.alignment.center
    )
    page.add(BigBoiBox)
    page.horizontal_alignment=ft.MainAxisAlignment.CENTER
    page.vertical_alignment=ft.CrossAxisAlignment.CENTER

    

ft.app(target=main)