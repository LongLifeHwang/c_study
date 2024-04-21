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
    for i in range(len(str1)):
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



    