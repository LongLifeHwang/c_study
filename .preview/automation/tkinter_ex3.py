import tkinter as tk

def convert():
    temp = float(entry.get())
    temp = 9 / 5 * temp + 32
    out.configure(text = 'Conberted : {:.1f}F'.format(temp))
    entry.delete(0, tk.END)

root = tk.Tk()
msg = tk.Label(root, text = "temperature")
out = tk.Label(root, text = "answer")
entry = tk.Entry(root, width = 4)
button = tk.Button(root, text = "check", command = convert)
msg.grid(row = 0, column = 0)
out.grid(row = 1, column = 0)
entry.grid(row = 0, column = 2)
button.grid(row = 0, column = 3)
root.mainloop()


