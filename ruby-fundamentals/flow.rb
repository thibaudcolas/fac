#1 Ask for the age. In int.
age = gets.to_i

#2 Process
output = if age < 10
          "It's a young person."
        elsif age < 19
          "It's a teenager."
        elsif age < 45
          "It's an adult."
        elsif age < 95
          "It's an old person."
        else
          "Not dead yet ?"
        end
puts output

puts "doif" if age > 18
puts "unless" unless false
#3 Output
