pyg = 'ay'

original = input('Enter a word:')   # python2 에서는 input대신 raw_input

if len(original) > 0 and original.isalpha():
  word = original.lower()
  first = word[0]
  new_word = word + first + pyg 
else:
    print ('empty')