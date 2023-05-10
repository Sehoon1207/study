print ('Welcome to the Pig Latin Translator!')

# Start coding here!
original = input("Enter a word: ")    # python2 에서는 input대신 raw_input
if len(original) > 0 and original.isalpha() == True :
  print (original)
else:
  print ("empty") 
  

# isalpha() : 변수 안에 문자와 숫자를 구분
# x = "J123"
# x.isalpha()  # This will return 'False'