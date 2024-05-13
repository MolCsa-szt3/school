import flet as ft

genders = ["férfi","yes","nő"]
def main(page: ft.Page):
    
    page.title = 'Form Projekt'
    page.scroll = ft.ScrollMode.AUTO
    
    nev = ft.TextField(label="Név")
    
    
    def slider_changed(e):
        nem.value = f"Nem: {genders[int(e.control.value)]}"
        page.update()
    nem = ft.Text("Nem: férfi")
    
    
    droppu = ft.Dropdown(
        hint_text="Monster Hunter",
        options=[
            ft.dropdown.Option("Még nem játszottam"),
            ft.dropdown.Option("Korábbival/ nincs a listán"),
            ft.dropdown.Option("MH3U"),
            ft.dropdown.Option("MH4U"),
            ft.dropdown.Option("MH Gen / MHGU"),
            ft.dropdown.Option("MH World:Iceborne"),
            ft.dropdown.Option("MH Rise: Runbreak"),
        ]
    )
    

    radio = ft.RadioGroup(
        content=ft.Column([
            ft.Radio(value="LR", label="Low Rank / nem játszottam"),
            ft.Radio(value="HR", label="High Rank"),
            ft.Radio(value="G/MR", label="G Rank / Master Rank")
        ])
    )
    

    def weapon_switch(e):
        weaponswitch.label = "Gunner" if weaponswitch.value else "Swordmaster"
        page.update()
        
    weaponswitch = ft.Switch(
        label="Swordmaster", on_change=weapon_switch,
    )

    col = ft.Column(
        [
        nev,
        nem, ft.Slider(min=0, max=2, divisions=2, on_change=slider_changed, width=100),
        ft.Text("Melyik mainline Monster Hunter-el játszottál legelőször:"), droppu,
        ft.Text("Meddig jutottál megmesszebb egy Moster Hunter-ban:"), radio,
        ft.Text("Swordmaster or Gunner?"),weaponswitch
        ],
        alignment= ft.alignment.center,
        width=300

    )
    BigBoiBox = ft.Container(
        content=col,
        width=300,
        alignment= ft.alignment.center
    )
    page.add(BigBoiBox)
    page.horizontal_alignment=ft.MainAxisAlignment.CENTER
    page.vertical_alignment=ft.CrossAxisAlignment.CENTER

    

ft.app(target=main)