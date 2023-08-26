# Author : Eyasue Mengesha


import random

player_1 = input(
   "Welcome to the game of pig, I will need your name Player 1: ")
# Ask's for player 1's name

player_2 = input(
   "So you are the person who decided it was best to face {}. Well regardless of the outcome I wil need your name Player 2: ".format(player_1))
# Ask's for player 2's name

Dice = random.randint(1, 6)
# Creates a dice using the random method, I put it between 1 and 6 because a die has 6 sides.

P1_CurrentScore = 0
# Player 1's current score

P2_CurrentScore = 0
# Player 2's curret score

total = True


print()
print("*************************************************************")
print("HEEEELLLLLLLOOOOO EVERYONE AND WELCOME TO FIGHT NIGGGGHT!!!!! ")
  # I'm trying be make my programs more interesting and unique, makes things more fun.

print()
Pick_1 = input("Ok {} it's your turn, Roll or Hold: ".format(player_1))
  # Calls the first player by their name and asks said user if they want to roll or hold

while True:

    while True:

        total = True
        if Pick_1 != "Roll" and Pick_1 != "Hold":
                Pick_1 = input("Roll or Hold man nothing else: ")
            
        if Dice == 1:
                P1_CurrentScore = 0
                print("You rolled a 1 and lost all of your points")
                print()
                print("{}'s current score is ".format(player_1),P1_CurrentScore)
                total = False

        elif Pick_1 == "Roll" and Dice != 1:
                Dice = random.randint(1, 6)
                P1_CurrentScore += Dice

                print("You rolled a {}".format(Dice))
                print()
                print("Current score {}".format(P1_CurrentScore))

                Pick_1 = input("And again, Roll or Hold: ".format(player_1))


        elif Pick_1 == "Hold":
                P1_CurrentScore = P1_CurrentScore
                print("Ok {} you decided to hold, now its {}'s turn.".format(
                player_1, player_2))
                print()
                print("{}'s current score is {}".format(player_1,P1_CurrentScore))
                total = False
                

        if total == False:
            Pick_2 = input("Now it's {}'s turn, so the question is Roll or Hold: ".format(player_2))
            
            while True:
                

                    
                    if Pick_2 != "Roll" and Pick_2 != "Hold":
                            Pick_2 = input("Roll or Hold man nothing else: ")
                        
                    

                    elif Pick_2 == "Roll":
                            Dice_2 = random.randint(1, 6)
                            P2_CurrentScore += Dice_2

                            print(P2_CurrentScore)

                            Pick_2 = input("And again, Roll or Hold: ".format(player_2))

                    if Dice_2 == 1:
                        P2_CurrentScore = 0
                        print("You rolled a 1 and lost all of your points")
                        print()
                        print("{}'s current score is ".format(player_2),P2_CurrentScore)
                        break

                    if Pick_2 == "Hold":
                            P2_CurrentScore = P2_CurrentScore
                            print("Ok {} you decided to hold, now its {}'s turn.".format(
                            player_2, player_1))
                            print()
                            print("{}'s current score is {}".format(player_2,P2_CurrentScore))
                            total = True
                            break

                    if total == True:
                        Pick_1 = input("Ok {} it's your turn, Roll or Hold: ".format(player_1))

                        
            P1_CurrentScore = P1_CurrentScore
        if P1_CurrentScore >= 100:
            print("Player 1 has won")
            break



