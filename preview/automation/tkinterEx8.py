from tkinter import *

def click():
    label.configure(text = "Button clicked", fg = "blue")

root = Tk()
label = Label(text = "Button not clicked", fg = "red")
button = Button(text = "click Me!", command = click)
label.pack()
button.pack()
root.mainloop()
