print ('Welcome to the Pig Latin Translator!')

# Start coding here!
original = raw_input("Enter a word: ")
if len(original) > 0 and original.isalpha() == True :
  print (original)
else:
  print ("empty") 
  

# isalpha() : 변수 안에 문자와 숫자를 구분
# x = "J123"
# x.isalpha()  # This will return 'False'