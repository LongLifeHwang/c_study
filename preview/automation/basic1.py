PI = 3.14

def cir_cirm(r = 5):
    return (2 * r * PI)

def squares(n):
    return (n * n)

numbers = [1, 2, 3, 4]
print(f'list : {list(map(squares, numbers))}')
print(f'circle cirm : {cir_cirm(3):.2f}')

