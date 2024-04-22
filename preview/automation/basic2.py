def ptrStr(str):
    print(f'{str}')
str = "Hello world"
ptrStr(str)

test = {'a' : "hi", 'b' : 'bye'}
for i in test.items():
    print(i)
    
s = "Hi, everyone. Nice to meet you!"
s = s.replace(",", "")
s = s.replace('.', '')
s = s.replace('!', '')
print(s)
l = [3, 6, 9]
l.insert(1, 7)
l.append(5)
del l[:2]
print(l)
