from tkinter import *

def click():
    temperature = float(entry.get())
    temperature = 9 / 5 * temperature + 32
    entry.delete(0, END)
    answer.configure(text = f'Converted : {temperature : .1f}')

root = Tk()
question = Label(text = "Enter a temperature")
entry = Entry()
button = Button(text = "Ok", command = click)
answer = Label(text = "...")
question.grid(row = 0, column = 0)
entry.grid(row = 0, column = 1)
button.grid(row = 0, column = 2)
answer.grid(row = 1, column = 1)
root.mainloop()
