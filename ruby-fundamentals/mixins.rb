module Login
  def login username, password
    @username == username and @password == password and p "Successfully logged in as #@username"
  end

  def logout
  end

  def sign_up
  end
end

class Student
  include Login

  def initialize name, born_at, gender, username, password
    @name = name
    @born_at = born_at
    @gender = gender
    @username = username
    @password = password
  end

  def age
    age = Date.today.year - @born_at.year
    age -= 1 if Date.today < birthday + age.years
  end
end

class Teacher
  include Login

  def initialize name, proficiency, list_of_grades, username, password
    @name = name
    @proficiency = proficiency
    @list_of_grades = list_of_grades
    @username = username
    @password = password
  end
end

student = Student.new "Bob", Time.new("1970-04-12"), "M", "bob", "alice"
teacher = Teacher.new "Alice", Time.new("1970-04-12"), "F", "alice", "tony"

student.login "bob", "alice"
teacher.login "alice", "tony"
