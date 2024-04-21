print("====1====")
word = 'Dongyang Mirae Umiversity'
print(len(word))

print("\n====2====")
s = "Hi, everyon. Nice to meet you!"
s = s.replace(',', '')
s = s.replace('.', '')
s = s.replace('!', '')
print(s)

print("\n====3====")
L = [3, 6, 9]
L.insert(1, 7)
L.append(5)
print(L)
del L[:2] #마지막 인덱스는 체크하지 않음
print(L)
