import flet as ft

font_width = 8
font_height = 16

def get2DIndex(width, index):
    return [index % width, index // width]

def from2DIndex(width, index2D):
    return index2D[0] + (index2D[1] * width)

def offsetAndSizes2D(index2D_1, index2D_2, width):
    #god I understand now why the Y+ axis is down instead of up
    X = index2D_1[0] - index2D_2[0]
    Y = index2D_1[1] - index2D_2[1]
    start = [
        index2D_1[0] if X <= 0 else index2D_2[0],
        index2D_1[1] if Y <= 0 else index2D_2[1],
    ]
    print(index2D_1)
    print(index2D_2)
    print(X)
    print(Y)
    print(start)
    print(from2DIndex(width, start))
    return [
        from2DIndex(width, start),
        [abs(X), abs(Y)]
    ]
    

class Symbol:
  def __init__(self, name, color, char):
    self.name = name
    self.color = color
    self.char = char

characters = [
    Symbol("floor", ft.colors.BLUE, "."),
    Symbol("wall", ft.colors.RED, "W"),
    Symbol("oob", ft.colors.GREY, " ")
    #add more here
    ]

def getColor(name):
    for item in characters:
        if item.name == name:
            return item.color
    return ft.colors.PURPLE #shouldn't see this

def getChar(color):
    for item in characters:
        if item.color == color:
            return item.char
    return "L" #shouldn't see this

def _selecterFiller():
    thing = []
    for item in characters:
        thing.append(ft.dropdown.Option(item.name))
    return thing

def wallTable(checks):
    if checks == [True, True, True, True]: return "+"
    if checks[0] == True and checks[2] == True: return "|"
    if checks[1] == True and checks[3] == True: return "-"
    if checks[0] == True or checks[2] == True: return "|"
    return "-"

def wallCheck(rawText):
    lines = rawText.strip().split("\n")
    characters = []
    print(characters)
    check = [False, False, False, False] #clockwise
    offsets = [
        [1,0],
        [0,1],
        [-1,0],
        [0,-1]
    ]
    for line in range(len(lines)):
        for char in range(len(lines[line])):
            def wallSub(offset):
                try: 
                    return (lines[line + offset[0]][char + offset[1]])
                except:
                    return " "
            #print("[" +str(line) + "," + str(char) + "]")
            #print(lines[line][char])
            if lines[line][char] == "W":
                #print("oi!")    
                for attempt in range(len(offsets)):
                    check[attempt] = wallSub(offsets[attempt]) in "W+-|"
                #print(wallTable(check))
                lines[line] = lines[line].replace("W", wallTable(check), 1)
                check = [False, False, False, False]
        lines[line] += "\n"
    return lines
            



                
            

def main(page: ft.Page):
    
    page.title = 'Nethack-style map creator'
    page.scroll = ft.ScrollMode.AUTO

    width = ft.TextField(label="X", value="80")
    height = ft.TextField(label="Y", value="26")

    sides = [0,0]

    




    rectangleSelected = [-1,-1]# aka nothing selected
    fuckAll = [-1,-1] #to compare with line above

    selecter = ft.Dropdown(
        #no this is not empty, just gets filled later, code spagetti
    )

    drawShapes = ft.Dropdown(
        options=[
            ft.dropdown.Option("Single"),
            ft.dropdown.Option("Rectangle(hollow)"),
            ft.dropdown.Option("Rectangle(full)")
        ],
        value="Single",
        #on_change=checkForSelectedSingle,
        #put later becuase flet/python is a bitch
        label="Selection"
    )

    def checkForSelectedSingle(e):
        if rectangleSelected != fuckAll and drawShapes.value == "Single":
            item = selecter.controls[from2DIndex(sides[0],rectangleSelected)]
            selectedColor = getColor(selecter.value)
            item.bgcolor = selectedColor
            item.content.color = selectedColor
            rectangleSelected[0] = -1
            rectangleSelected[1] = -1
            #basically reset it if single is selected while one is selected

    drawShapes.on_change=checkForSelectedSingle

    mapdimensions = ft.Row(
        [width, height]
    )

    page.add(mapdimensions)

    mapper = ft.Row(
        controls=[], 
        wrap=True, width=int(width.value)*(font_width + 2),
        spacing=0,
        run_spacing=0
        )
    
    def drawRectangle(offset2D):
        for i in range(offset2D[1][0] + 1):
            for j in range(offset2D[1][1] + 1):
                if(   i == 0
                   or j == 0 
                   or i == offset2D[1][0]
                   or j == offset2D[1][1]
                   or drawShapes.value == "Rectangle(full)"
                ):
                    item = mapper.controls[from2DIndex(sides[0],[i,j]) + offset2D[0]] 
                    selectedColor = getColor(selecter.value)
                    item.bgcolor = selectedColor
                    item.content.color = selectedColor

    
        
    def change_color(e):
        #print(e.control)
        selectedColor = getColor(selecter.value)
        if(drawShapes.value == "Single"):
            e.control.bgcolor = selectedColor
            e.control.content.color = selectedColor
        else:
            if rectangleSelected == fuckAll:
                twoDee = get2DIndex(sides[0],int(e.control.content.value))
                rectangleSelected[0] = twoDee[0]
                rectangleSelected[1] = twoDee[1]
                #god why
                selectedColor = ft.colors.PINK
                e.control.bgcolor = selectedColor
                e.control.content.color = selectedColor
            else:
                drawRectangle(offsetAndSizes2D(rectangleSelected, get2DIndex(sides[0],int(e.control.content.value)), sides[0]))
                rectangleSelected[0] = -1
                rectangleSelected[1] = -1
        page.update()

    def items(count): #shamelesly stolen from the documentation
        items = []
        for i in range(count):
            items.append(
                ft.Container(
                    alignment=ft.alignment.center,
                    width=font_width,
                    height=font_height,
                    content=ft.Text(value=str(i), color=getColor(selecter.value)),
                    bgcolor=getColor(selecter.value),
                    margin=1,
                    on_click=change_color
                )
            )
        return items
    
    def check_things(e):
        if(width.value.isdigit and width.value.isdigit):
            mapper.controls = items(int(width.value) * int(height.value))
            mapper.width=int(width.value)*(font_width + 2)
            sides[0] = int(width.value)
            sides[1] = int(height.value)
            page.update()

    check = ft.TextButton(
        width=100,
        text="Generate",
        on_click=check_things
    )


    selecter = ft.Dropdown(
        options=_selecterFiller(),
        value=characters[0].name
    )

    page.add(ft.Row([check, selecter, drawShapes]))


    
    page.add(mapper)
    """
    TODO: 
    - add ability to change the "value" of the segments to walls/floor/corridors/OOB --DONE?
    - add ability to select entire row/column with said tool (slider? sliders?)
    - add monospace font (fuck it it can come later)
    - add text output

    extras: -
    - rectangle drawing option?

    """
    """page.fonts = {
        "monospace":
    }"""
    def makeText(e):
        text = ""
        items = mapper.controls
        print(e)
        for i in range(len(items)):
            text += getChar(items[i].bgcolor)
            if not (i+1) % sides[0]:
                text += "\n"
        with open("map.txt", "w") as pront:
            pront.writelines(wallCheck(text))

    mapCheck = ft.TextButton(
        width=100,
        text="Save as .txt",
        on_click=makeText
    )
    page.add(mapCheck)
    
    page.horizontal_alignment=ft.MainAxisAlignment.CENTER
    page.vertical_alignment=ft.CrossAxisAlignment.CENTER
    page.update()

    

ft.app(target=main)