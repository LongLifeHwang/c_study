import tkinter as tk

root = tk.Tk()
radio = tk.StringVar()
radio.set("Red")
f = tk.Frame(relief = tk.RAISED, borderwidth = 5)
red = tk.Radiobutton(f, text = "Red", variable = radio, value = "Red")
green = tk.Radiobutton(f, text = "Green", variable = radio, value = "Green")
blue = tk.Radiobutton(f, text = "Blue", variable = radio, value = "Blue")
red.grid(row = 0, column = 0)
green.grid(row = 0, column = 1)
blue.grid(row = 0, column = 2)
f.pack()
root.mainloop()




