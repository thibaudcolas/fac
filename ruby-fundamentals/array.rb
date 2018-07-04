[1,2,3].class

# Combine
[1,2] + [3, 4]

# Place at the end
[1, 2] << 3
# Same as .push
# Also has .pop (destructive)
#
# Shift / Unshift < List > Push / Pop

# Place at beginning
[1, 2].unshift 3

# .compact : removes nil
# count, size, length

a = [1,2,3,4]
# Raises an exception instead of returning nil
a.fetch(5)

# PHP in array -> include?

%w(S t r i n g).join ""

# Param = code block
[1, "one", 2, "two", 3, "three"].select { |item| item.is_a? String }

# .select, .reject, .map
