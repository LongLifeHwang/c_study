import tkinter as tk

def click():
    label.configure(text = "Yes clicked")

root = tk.Tk()
root.title("click")
label = tk.Label(root, text = "Not clicked")
button = tk.Button(root, text = "Button", command = click)
label.grid(row = 0, column = 0)
button.grid(row = 1, column = 0)
root.mainloop()
