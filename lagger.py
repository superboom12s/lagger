import math
import random

continuar = input("Your processor will overheat, continue?\n[Y/N]")

if continuar == "Y" or continuar == "y":

    print("loading...")

    loopVal = 0

    lagString = []

    for i in range(99999999):

        lagString.append(" ")

    print("load ended")


    while True:

        actualLag = math.sqrt(math.sqrt(random.randint(0, 99999999)))

        print(actualLag)

        try:
            lagString[loopVal] = actualLag
            loopVal += 1
        except:
            loopVal = 0

else:

    print("Canceled.")
