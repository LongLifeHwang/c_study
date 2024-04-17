class People:
    def __init__(self, age = 0, name = None):
        self.age = age
        self.name = name
    def introMe(self):
        print("Name : ", self.name, "\nage : ", self.age)

#sub class(super class) : 부모에 있는 모든 내용을 상속을 받음(변수 , 함수 모두다)
class Student(People):
    def __init__(self, age = 0, name = None, grade = None):
        #super class의 함수를 사용하기 위해서는 super().함수명으로 사용하기
        super().__init__(age, name)
        self.grade = grade
    #intoMe는 super class의 오버라이딩된 함수이다. 
    def introMe(self):
        #마찬가지로 super class의 함수를 사용함
        super().introMe()
        print("Grade : ", self.grade)

ingu = Student(24, "inghwang", "a+")
ingu.introMe()
        