with open("nyilvantartas.txt",encoding="utf8") as tart:
    info = tart.readlines()
    infolist = []
    for i in info:
        name,forg,place,year = i[:-1].split()
        infolist.append({"Név":name,"Forgalom":forg,"Munkahely":place,"Munkaév":year})
    while True:
        name = input("Név: ")
        if not name:
            break
        forg = input("Forgalom: ")
        place = input("Munkahely: ")
        year = input("Munkaév: ")
        infolist.append({"Név": name, "Forgalom": forg, "Munkahely": place, "Munkaév": year})
    #okay we done with inputs
    print(f"{len(infolist)}db ügyfelünk van.")
    pick_list = []
    forg_nevek = ""
    for i in infolist:
        if i["Munkahely"] == "Pick":
            pick_list.append(i["Név"])
        if int(i["Forgalom"]) > 10000:
            forg_nevek += i["Név"] + " "

    pickek = ""
    for i in pick_list:
        pickek += i + "-"
    pickek = pickek[:-1]

    print(f"{len(pick_list)}db ügyfél munkahelye a Pick, ezek pedig: {pickek}")
    print(f"10000Ft forgalmat meghaladó ügyfeleink nevei: {forg_nevek[:-1]}")
    with open("kivalougyfel.txt","w",encoding="utf8") as kivalo:
        for i in infolist:
            if int(i["Forgalom"]) > 10000:
                kivalo.write(f"{i['Név']} {i['Forgalom']} {i['Munkahely']} {i['Munkaév']}\n")