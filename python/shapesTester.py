import shapes

def main():
    s1 = shapes.Square(length = 2)
    s2 = shapes.Square(length = 4, xCenter = 2, yCenter = 2)
    print(s1.intersects(s2))




if __name__ == '__main__':
    main()
    