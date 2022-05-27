def hotel_cost (nights):
    return 140 * nights

def plane_ride_cost (city):
    if city == "Charlotte":
        return 183
 
    if city == "Tampa":
        return 220
 
    if city == "Pittsburgh":
        return 222
 
    if city == "Los Angeles":
        return 475
    
    
# elow your existing code, define a function called plane_ride_cost that takes a string, city, as input.

# The function should return a different price depending on the location, similar to the code example above. Below are the valid destinations and their corresponding round-trip prices.

# "Charlotte": 183
# "Tampa": 220
# "Pittsburgh": 222
# "Los Angeles": 475