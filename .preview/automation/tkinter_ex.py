import tkinter as tk

#기본 창을 생성하기 "root = tk.Tk()" root가 창이라고 생각하면 좋음
root = tk.Tk()
#Lable을 사용하여 창에 Label을 표시함
label = tk.Label(root, text = "Hello world")
label.pack()
root.mainloop()
