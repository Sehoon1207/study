def distance_from_zero (hier):
    if ( type(hier) == int or type(hier) == float):
        return abs(hier)
    else :
        return "Nope"