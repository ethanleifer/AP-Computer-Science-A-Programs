#imports
from DEgraphics import *

def getUserName():
    '''asks for person's name and returns that string'''
    result = input("Please type in your name: ")
    return result

def main():
    '''main method of my first graphics python program'''
    #username = getUserName()
    #print("Hello, " + username + "!")

    g = DEGraphWin()

    g.toggleAxes()
    c = Circle(Point(0,0),5)
    c.setWidth(5)
    c.setFill("yellow")
    c.setOutline("blue")


    c.draw(g)

    g.getMouse()
    c.undraw()

    g.getMouse()
    g.close()
if __name__ == "__main__":
    main()
