class Deposit:
    def __init__(self, initial = 100, interest = 3.5, n = 7):
        self.initial = initial
        self.interest = interest
        self.n = n
    
    def profit(self):
        plus = 1
        i = 0
        while (i < self.n):
            plus *= (1 + self.interest / 100)
            i += 1
        return (self.initial * plus)

class Calculator:
    def __init__(self):
        self
    def calc(self, n, m, str):
        if (str == "add"):
            return (n + m)
        elif (str == "sub"):
            return (n - m)
        elif (str == "mul"):
            return (n * m)
        elif (str == "div"):
            if (m != 0):
                return (n / m)

person = Deposit(100, 3.5, 7)
print(f'profit : {person.profit():.0f}')
test = Calculator()
print(f'3 + 5 = {test.calc(3, 5, "mul")}')