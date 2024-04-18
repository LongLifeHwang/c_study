from tkinter import *

def check():
    print(f"Beer is {beer.get()}")
    print(f"Wine is {wine.get()}")
    print(f"Water is {water.get()}\n")

root = Tk()
f = Frame(relief=RAISED, borderwidth = 5)
beer = BooleanVar()
wine = BooleanVar()
water = BooleanVar()
c1 = Checkbutton(f, text = "Beer", var = beer, command = check)
c2 = Checkbutton(f, text = "Wine", var = wine, command = check)
c3 = Checkbutton(f, text = "Water", var = water, command = check)
c1.pack()
c2.pack()
c3.pack()
f.pack()
root.mainloop()



