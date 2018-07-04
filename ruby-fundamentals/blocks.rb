def form &block
  puts "<form>"
  yield if block_given?
  puts "</form>"
end

def paragraph text
  puts "<p>" + text + "</p>"
end

def quote text
  puts "<blockquote>" + text + "</blockquote>"
end

form do
  paragraph "This is a paragraph"
  quote "This is a quote."
end

form
