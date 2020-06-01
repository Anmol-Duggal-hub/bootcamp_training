def rpsGame(p1,p2):
    choices={"rock":{"scissor":"Player 1 Wins", "paper":"Player 2 Wins", "rock":"Tie Game"},
            "scissor":{"paper":"Player 1 Wins", "rock":"Player 2 Wins", "scissor":"Tie Game"},
            "paper":{"rock":"Player 1 Wins", "scissor":"Player 2 Wins", "paper":"Tie Game"}}
    return choices[p1][p2]

print(rpsGame("rock","scissor"))