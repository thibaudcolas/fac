# "Ho!" * 3

# "Hello" + " " + "World!"
# "Hello" << " World!"

p "hello world".upcase

#Changes the value of str.
#Destructive action.
#str.upcase!

"str".count "s"

# Destructive anyway.
"str".clear
"str".delete! "s"


%q{Multi line
String with
several
words}.each_line { |line| p line }
"".empty?

"".include? "smth"

"Hello World" =~ /\d+/

# Creates an array.
"a.b.c".split "."
