def add_and_power a,b
  (a+b)**(a+b)
end

puts "Enter two values !"
input1 = gets
input2 = gets

puts add_and_power input1.to_i, input2.to_i
