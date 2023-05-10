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

# Modify your trip_cost function definition. Add a third argument, spending_money.

# Modify what the trip_cost function does. Add the variable spending_money to the sum that it returns