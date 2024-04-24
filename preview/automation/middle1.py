print("====1====")
word = 'Dongyang Mirae Umiversity'
print(len(word))

print("\n====2====")
s = "Hi, everyon. Nice to meet you!"
s = s.replace(',', '')
s = s.replace('.', '')
s = s.replace('!', '')
print(s)

print("\n====4====")
L = [3, 6, 9]
L.insert(1, 7)
L.append(5)
del L[:2] #마지막 인덱스는 체크하지 않음
print(L)

print("\n====5====")
a = [1, 2, -2, 4, 7, 6, 9, 2, -3, 0]
total = 0
for i in a[::2]:
    total += i
print(total)

print("\n====6=====")
register = [{'name':'Todd', 'phone' : '555-1414'}, {'name':'Helga', 'phone' : '555-1618'}, {'name':'Princess', 'phone' : '555-3241'}, {'name':'LJ', 'phone' : '555-2718'}]
for people in register:
    if people['phone'][-1] == '8':
        print(people['name'])

print("\n====7====")
class Test:
    def __init__(self, a, b):
        self.a = a + 1
        self.b = b + 2
    def add(self):
        return (self.a + self.b)
t = Test(5, 6)
print(t.add())

print("\n====8====")
words = list(filter(lambda x: len(x) > 2, ['this', 'is', 'a', 'test']))
print(words)

print("\n====9====")
class Password_manager:
    def __init__(self):
        self.old_passwords = []
    def set_password(self, password):
        if password not in self.old_passwords:
            self.old_passwords.append(password)
        else:
            print(f"{password} is an old password")
    def get_password(self):
        return self.old_passwords[-1]
    def is_correct(self):
        return self.old_passwords[-1]
    def is_correct(self, words):
        if (self.old_passwords[-1] == words):
            return (True)
        return (False)
password = Password_manager()
password.set_password("hi")
password.set_password("hi2")
password.set_password("hi")
print(f'get_password() : {password.get_password()}')
print(f'is_correct() : {password.is_correct("hi2")}')

print("\n====11====")
def first_diff(str1, str2):
    if (str1 == str2):
        return (-1)
    for i in range(min(len(str1), len(str2))):
        if (str1[i] != str2[i]):
            return (i)
print(f'{first_diff("hi", "hi2")}')

print("\n====12====")
grade = {"A" : 8, "D" : 3, "B" : 15, "F" : 0, "C" : 6}
for k in grade.keys():
    print(k)

print("\n====13====")
days = {'January' : 31, 'February' : 28, 'March' : 31, 'April' : 30, 'May' : 31, 'June' : 30, 'July' : 31, 'Agust' : 31, 'Septembr' : 30, 'October' : 31, 'November' : 30, 'December' : 31}
print(days['April'])
s = []
for i in days.keys():
    if (days[i] == 30):
        s.append(i)
print(s)

print("\n====14====")
def total(*numbers):
    sum = 0
    for n in numbers:
        sum += n
    return (sum)
print(total(1, 2, 3, 4, 5))

print("\n====15====")
class Square:
    def __init__(self, side_length):
        self.side_length = side_length
    def area(self):
        return (self.side_length * self.side_length)
    def perimeter(self):
        return (4 * self.side_length)
    def diagonal(self):
        return (self.side_lenth * self.side_length) ** 0.5

print("\n====16====")
class Animal:
    def __init__(self, name):
        self.name = name
    def speak(self):
        print(f'내 이름은 {self.name}입니다.')
class Dog(Animal):
    def speak(self):
        super().speak()
        print("멍멍!")
dog = Dog('Hory')
dog.speak()








from tkinter import *

def display():
    label_text = ''
    if show_totals.get() == True:
        label_text += "'Show Totals' checked"
    else:
        label_text += "'Show Totals' unchecked"
    
    if radio.get() == 'day':
        label_text += " and 'Day' selected"
    elif radio.get() == 'month':
        label_text += " and 'Month' selected"
    elif radio.get() == 'year':
        label_text += " and 'Year' selected"
    label.configure(text = label_text)
    
root = Tk()

show_totals = BooleanVar()
#check = Checkbutton(root, text = 'Show Totals', var=show_totals, command=display)
check = Checkbutton(root, text = 'Show Totals', var=show_totals)

radio = StringVar()
radio.set('day')
daybutton = Radiobutton(text ='Day', var = radio, value='day')
monthbutton = Radiobutton(text ='Month', var = radio, value='month')
yearbutton = Radiobutton(text ='Year', var = radio, value='year')

button = Button(text='확인', command=display)
label = Label()

check.grid(row=0, column=0, sticky=W)
button.grid(row=0, column=1, sticky=W)
daybutton.grid(row=1, column=0, sticky=W)
monthbutton.grid(row=1, column=1, sticky=W)
yearbutton.grid(row=1, column=2)
label.grid(row=2, column=0)

root.mainloop()


    