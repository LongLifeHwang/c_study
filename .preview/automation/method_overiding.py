class People:
    def __init__(self, age = 0, name = None):
        self.age = age
        self.name = name
    def introMe(self):
        print("Name : ", self.name, "\nage : ", self.age)

class Student(People):
    def __init__(self, age = 0, name = None, grade = None):
        super().__init__(age, name)
        self.grade = grade
    def introMe(self):
        super().introMe()
        print("Grade : ", self.grade)

ingu = Student(24, "inghwang", "a+")
ingu.introMe()
        