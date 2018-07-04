/abc/.class

%r(abc)

/arf/ =~ "Garfunkel"
/Garf/ =~ "Garfunkel"
/Garf/ =~ "Garfield"
/Garf/i =~ "garfield"
/ab.c/x # Ignores whitespace and comment

p /abc/xi =~"Abc"
p /a # First letter
  b # Second letter
  c
  /xi =~ "Abc"
