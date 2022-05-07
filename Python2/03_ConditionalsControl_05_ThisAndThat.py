bool_one = False or not True and True

bool_two = False and not True or True

bool_three = True and not (False or False)

bool_four = not not True or False and not True

bool_five = False or not (True and True)


# Just like with arithmetic operators, there’s an order of operations for boolean operators:

# not is evaluated first;
# and is evaluated next;
# or is evaluated last.