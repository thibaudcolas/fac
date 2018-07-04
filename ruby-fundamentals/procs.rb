def form &block
  puts "<form>"
  #Test if parameter was set.
  yield if block_given?
  puts "</form>"
end

def form_with_proc p
  puts "<form>"
  p.call true
  puts "</form>"
end

def paragraph text
  puts "<p>" + text + "</p>"
end

def quote text
  puts "<blockquote>" + text + "</blockquote>"
end

# form do
#   paragraph "This is a paragraph"
#   quote "This is a quote."
# end

myproc = lambda do |only_quotes|
  p only_quotes
  paragraph "This is a paragraph" unless only_quotes
  quote "This is a quote."
end

form_with_proc myproc
