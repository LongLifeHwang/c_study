import tkinter as tk

tex = "OFF"
col = "red"

def click():
    global tex, col
    if (tex == "OFF"):
        tex = "ON"
        col = "blue"
    else:
        tex = "OFF"
        col = "red"
    button.configure(text = tex, bg = col)

root = tk.Tk()
root.title("test")
button = tk.Button(root, text = "OFF", fg = "yellow", bg = "red", command = click)
button.pack()
root.mainloop()
