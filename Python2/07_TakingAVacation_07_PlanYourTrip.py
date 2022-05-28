def hotel_cost(nights):
    return 140 * nights

def plane_ride_cost(city):
    if city == "Charlotte":
        return 183
    elif city == "Tampa":
        return 220
    elif city == "Pittsburgh":
        return 222
    elif city == "Los Angeles":
        return 475

def rental_car_cost(days):
    cost = days * 40
    if days >= 7:
        cost -= 50
    elif days >= 3:
        cost -= 20
    return cost

def trip_cost(city, days, spending_money):
  return plane_ride_cost(city)+hotel_cost(days-1)+rental_car_cost(days) + spending_money

print (trip_cost("Los Angeles", 5, 600))


# print out the trip_cost( to "Los Angeles" for 5 days with an extra 600 dollars of spending money.